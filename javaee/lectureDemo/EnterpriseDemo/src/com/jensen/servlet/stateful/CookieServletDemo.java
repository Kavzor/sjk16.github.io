package com.jensen.servlet.stateful;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieDemo/cookie")
public class CookieServletDemo extends HttpServlet{

	/**
	 * Cookies kan best� av tv� olika typer
	 * Typ 1: Session elr. Temporary cookie
	 * Session cookie tar en del av serverns minne, och plockas bort
	 * d� webbl�saren st�ngs ner
	 * 
	 * Typ 2: Persistent elr. Permanent cookie
	 * Tar en del av klientens minne och st�ngs ner efter ett best�mt tidsintervall
	 * @throws IOException 
	 */
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		//Default �r en cookie temporary
		Cookie cookie = new Cookie("name", name);
		
		//setMaxAge(int seconds) g�r cookie:n till en permanent cookie
		//Den tas bort fr�n klienten d�, i detta fall, 900 sekunder har passerat
		//Negativt v�rde s�tter cookie:n till en temporary cookie igen
		cookie.setMaxAge(900);
		
		response.addCookie(cookie);
		
		//Ny cookie
		cookie = new Cookie("email", email);
		
		response.addCookie(cookie);
		
		//Nu �r vi klara
		response.getWriter().println("cookies added");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		doGet(request, response);
	}
	
}
