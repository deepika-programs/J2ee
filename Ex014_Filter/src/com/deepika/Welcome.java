package com.deepika;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().println("This is just a welcome page");
		
		System.out.println("This is just a welcome page");
		
		Cookie c = new Cookie("userfullname", "Deepika");
		c.setMaxAge(20);
		response.addCookie(c);
	
	
	}

}
