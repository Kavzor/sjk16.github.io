package com.jensen.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/jspDemo/calculator"})
public class CalculatorServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
		ServletException, IOException{
		String firstValue = request.getParameter("firstValue");
		String secondValue = request.getParameter("secondValue");
		String operator = request.getParameter("operator");
		
		
		if(isNumber(firstValue) && isNumber(secondValue)) {
			int result = Integer.parseInt(firstValue) +
					Integer.parseInt(secondValue);
			request.setAttribute("result", result);
			
			
			//l�ter klienten leta upp resursen result.jsp
			//Att man skriver in queryn i omdirigeringen kallas
			//URL rewriting
			response.sendRedirect("result.jsp?result=" + result);
			
			//Letar upp result.jsp internet p� servern, ger oss
			//tillg�ng till WEB-INF foldern
//			request.getRequestDispatcher("result.jsp").
//				forward(request, response);
		}
		else {
			throw new ServletException("Either " + firstValue +
					"or " + secondValue + " isn't a number");
		}
	}
	
	public boolean isNumber(String number) {
		return number.matches("[0-9]+");
	}
	//"operator.matches("[+\\-/*]")
}
