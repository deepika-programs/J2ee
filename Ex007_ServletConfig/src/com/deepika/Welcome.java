package com.deepika;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		ServletConfig sc = getServletConfig();
		
		response.getWriter().println("Init Parameter 1: " + sc.getInitParameter("dbusername") + "<br>");
		response.getWriter().println("Init Parameter 2: " + sc.getInitParameter("dbpassword") + "<br>");
		
		response.getWriter().println("Servlet Name: " + sc.getServletName() + "<br>");
		response.getWriter().println("Context Path: " + sc.getServletContext().getContextPath() + "<br>");
   	
   	}

}
