package com.jensen.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionDemo/session")
public class SessionServletDemo extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException{
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		//Om getSession(false) - retunerar ingen "ny" session
		HttpSession session = request.getSession(true);
		
		session.setAttribute("name", name);
		session.setAttribute("email", email);
		
		//session.setMaxInactiveInterval(30);
	}
}
