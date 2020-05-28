package com.deepika;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Welcome")		// 1. Add WebServlet annotation along with the URL
public class Welcome extends HttpServlet {		// 2 Extend HttpServlet to the Class
	
	private static final long serialVersionUID = 1L;

	/*
	 * doGet method will be triggered in following scenarios:
	 * 
	 * 1. Hit the URL in the browser directly. (Ex: /Welcome)
	 * 2. Click on a anchor link. (Ex: <a href="/Welcome">Click here</a>)
	 * 3. Submit a form without method or method="get". (Ex: <form method="get">)
	 *  
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	// 3. Override doGet()
	
		System.out.println("Do get method is executed...!");
		
		resp.getWriter().print("Welcome to First Servlet");	// 4. Print response content in the browser
	
	}

}
