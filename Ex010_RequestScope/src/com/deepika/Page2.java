package com.deepika;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page2")
public class Page2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setAttribute("samp", "Some value...");
		
		request.getRequestDispatcher("page3").forward(request, response);
		
		//response.sendRedirect("page3");	//if we use sendRedirect, the attribute will not be sent since it will be a new request
	}

}
