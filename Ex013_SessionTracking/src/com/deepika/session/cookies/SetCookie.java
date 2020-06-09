package com.deepika.session.cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SetCookie")
public class SetCookie extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Create Cookie Example");
		
		Cookie coo1 = new Cookie("fullname", "Deepika~Ms");	//cookie value should not contain "empty space" in tomcat server above 8.5 version
		coo1.setMaxAge(20);
		response.addCookie(coo1);
		
		Cookie coo2 = new Cookie("age", "23");
		coo2.setMaxAge(20);
		response.addCookie(coo2);
		
	}

}
