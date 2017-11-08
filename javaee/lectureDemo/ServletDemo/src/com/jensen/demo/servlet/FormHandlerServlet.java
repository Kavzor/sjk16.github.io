package com.jensen.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formHandler")
public class FormHandlerServlet extends HttpServlet{

	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		//Parameter betyder att vi arbetar mot/med klienten
		//Attribut betyder att vi arbetar på servern
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		request.setAttribute("name", name);
		
		StringBuilder stringBuilder = new StringBuilder(email);
		String reversedEmail = stringBuilder.reverse().toString();
		
		request.setAttribute("email", reversedEmail);
		
		//Dispatcher samlar ihop request och response
		//sedan skickar det till nästa moment ex. en servlet
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("profile.jsp");
		
		dispatcher.forward(request, response);
	}
}
