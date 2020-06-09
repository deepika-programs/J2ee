package com.deepika;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/page4")
public class Page4 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		HttpSession ses = request.getSession(false);
		out.println("Attribute value: " + ses.getAttribute("samp"));
		
		ArrayList<String> arr = (ArrayList<String>) ses.getAttribute("samp2");
		out.println("List Items: ");
		for(String item : arr) {
			out.println(item);
		}
	
		out.flush();
		out.close();
		
	}

}
