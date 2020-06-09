package com.deepika.session.urlrewrite;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/urlWelcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		//response.setContentType("application/pdf");
		
		if(request.getCookies()!=null) {
			for(Cookie c : request.getCookies()) {
				if(c.getName().equals("result")) {
					response.getWriter().println("<h2 style='color:green;'>" + c.getValue().replaceAll("-", " ") + "</h2>");
				}
			}
		}
		
		response.getWriter().append("<a href='urlregistrationform'>Register</a>");
	}

}
