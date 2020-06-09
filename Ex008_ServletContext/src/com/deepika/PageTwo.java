package com.deepika;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext sc = getServletContext();
		
		response.getWriter().println(sc.getInitParameter("testparam"));
	
		Enumeration<String> en = sc.getInitParameterNames();
		while(en.hasMoreElements()) {
			String s = en.nextElement();
			response.getWriter().println(s + ": " + sc.getInitParameter(s));
		}
	}

}
