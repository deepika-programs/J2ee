package com.deepika.session.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetCookie")
public class GetCookie extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("<p>Print All the Cookie</p>");
		
		Cookie[] cookie = request.getCookies();
		
		for(Cookie coo : cookie) {
			out.println("<p> "+ coo.getName() + " : " + coo.getValue().replaceAll("~", " ") +" </p>");
		}
		
	}

}
