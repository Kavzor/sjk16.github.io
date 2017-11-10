package com.jensen.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InfoServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>Hello Woooooorld</h1>");
		
		out.println("<p>Request method used: " + req.getMethod() + "</p>");
		
		//out.println("<p>Name: " + req.getParameter("name") + "</p>");
		
		//loopa genom parameterar
		Enumeration<String> paramNames = req.getParameterNames();
		
		while(paramNames.hasMoreElements()) {
			String paramName = paramNames.nextElement();
			out.println("<p> Parameter name: " + paramName + "</p>");
			out.println("<p>" + req.getParameter(paramName) + "</p>");
		}
	}
}
