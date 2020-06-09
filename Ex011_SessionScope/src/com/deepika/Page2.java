package com.deepika;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/page2")
public class Page2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		HttpSession ses = request.getSession(true);	// can also be written as request.getSession(). Since true is default value, its not mandatory 
		ses.setMaxInactiveInterval(20);//20 seconds - If the user idle for the given seconds, it will invalidate automatically
		ses.setAttribute("samp", "Some value...");
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("hi");
		arr.add("hello");
		arr.add("welcome");
		arr.add("How are u");
		arr.add("bye");
		
		ses.setAttribute("samp2", arr);
		
		/*
		 * The session attribute can be retrieved in another servlet using request.getSession(false).
		 * No matter of redirecting the request using dispatcher or sendRedirect. 
		 * In all the case session will be active until we invalidate the session object.
		 * 
		 */
		
		//request.getRequestDispatcher("page3").forward(request, response);
		response.sendRedirect("page3");
	}

}
