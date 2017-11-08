package com.socialDemo.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/profile")
public class ProfileController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		Object isLoggedIn = session.getAttribute("isLoggedIn");
		
		if(isLoggedIn != null && (boolean) isLoggedIn) {
			String username = (String) session.getAttribute("username");
			request.setAttribute("username", username);
			
			request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
		}
		else {
			response.setContentType("text/html");
			response.getWriter().println("Not logged in yet \n"
					+ "<a href=\"index.jsp\">Go back</a>");
		}
	}
}
