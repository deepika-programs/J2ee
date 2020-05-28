package com.deepika;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formdata")
public class FormData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * doPost will be called when receiving the request as "Post" request
	 * 
	 * 1. Submit a form with method ="post". (Ex: <form method="post">)
	 * 
	 */
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Html Form Using Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Given User Name: " + request.getParameter("uname") + "</p>");
		out.println("<p>Given Password: " + request.getParameter("pwd") + "</p>");
		out.println("</body>");
		out.println("</html>");

		out.flush();
		out.close();

	}

}
