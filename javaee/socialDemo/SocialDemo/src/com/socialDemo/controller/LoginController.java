package com.socialDemo.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginController extends HttpServlet{
	private static final String MOCK_USERNAME = "abc";
	private static final String MOCK_PASSWORD = "123";
	
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals(MOCK_USERNAME) && password.equals(MOCK_PASSWORD)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			session.setAttribute("isLoggedIn", true);
			
			response.sendRedirect("profile");
		}
		else {
			response.getWriter().println("Failed to login \n"
					+ "<a href=\"index.jsp\">Go back</a>");
		}
	}
}
