package com.jensen.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mime")
public class MimeServletDemo extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
//		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
	
		
//		response.setContentType("text/json");
//		response.setContentType("application/json");
//		
//		out.write("{\"message\" : \"hello world\","
//				+ " \"data\" : \"value\"}");
		
//		response.setContentType("application/xml");
//		response.setContentType("text/xml");
//
//		out.write("<root>"
//				+ "<message>hello world</message>"
//				+ "<data>value</data>"
//				+ "</root>");
		
		response.setContentType("application/vnd.ms-excel");
		
		out.println("name \t age \t adress");
		out.println("Jakob \t 21 \t Gatavagen");
		
	}
}
