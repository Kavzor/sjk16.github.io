package com.jensen.demo.servlet.stateful;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieDemo/cookie")
public class CookieServletDemo extends HttpServlet{

	/**
	 * Cookies kan bestå av två olika typer
	 * Typ 1: Session elr. Temporary cookie
	 * Session cookie tar en del av serverns minne, och plockas bort
	 * då webbläsaren stängs ner
	 * 
	 * Typ 2: Persistent elr. Permanent cookie
	 * Tar en del av klientens minne och stängs ner efter ett bestämt tidsintervall
	 * @throws IOException 
	 */
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		//Default är en cookie temporary
		Cookie cookie = new Cookie("name", name);
		
		//setMaxAge(int seconds) gör cookie:n till en permanent cookie
		//Den tas bort från klienten då, i detta fall, 900 sekunder har passerat
		//Negativt värde sätter cookie:n till en temporary cookie igen
		cookie.setMaxAge(900);
		
		response.addCookie(cookie);
		
		//Ny cookie
		cookie = new Cookie("email", email);
		
		response.addCookie(cookie);
		
		//Nu är vi klara
		response.getWriter().println("cookies added");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		doGet(request, response);
	}
	
}
