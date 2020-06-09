package com.deepika.session.urlrewrite;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/urlsave")
public class Save extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		System.out.println(request.getParameter("fullname"));
		System.out.println(request.getParameter("gender"));
		System.out.println(request.getParameter("age"));
		
		System.out.println(request.getParameter("address"));
		System.out.println(request.getParameter("pincode"));
		
		System.out.println(request.getParameter("cardnum"));
		System.out.println(request.getParameter("expdate"));
		System.out.println(request.getParameter("cvv"));
		
		//db save logic
		
		Cookie coo = new Cookie("result", "Registration-Completed-Successfully!");
		coo.setMaxAge(1);
		response.addCookie(coo);
		
		response.sendRedirect("urlWelcome");
		
	}

}
