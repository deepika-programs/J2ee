package com.deepika;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page2")
public class PageTwo extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		ServletContext sc = getServletContext();
		String name = (String) sc.getAttribute("name");
		int age = (int) sc.getAttribute("age");
		
		response.getWriter().println("Name" + name);
		response.getWriter().println("Age" + age);
		
		sc.removeAttribute("name");
		sc.removeAttribute("age");
		
		response.getWriter().println("Attribute values after removal:");
		response.getWriter().println("Name" + sc.getAttribute("name"));
		response.getWriter().println("Age" + sc.getAttribute("age"));
	}

}