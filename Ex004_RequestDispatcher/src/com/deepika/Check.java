package com.deepika;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check")
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*
		 * RequestDispatcher - Dispatches the request to another servlet
		 * RequestDispatcher has 2 methods:
		 * 	1. include - will append the response of the corresponding servlet in the same place/line
		 *  2. forward - will forward the request&response completely to the another servlet
		 * 
		 */
		
		if (request.getParameter("uname").equals("admin") && request.getParameter("pwd").equals("pass")) {
			response.getWriter().print("<p><b style=\"color:red;\">Invalid user name and password. Please try again</b></p>");
			
			//request.getRequestDispatcher("success").forward(request, response);
			//The above line can also be written like below
			
			RequestDispatcher rd = request.getRequestDispatcher("success");
			rd.forward(request, response);	//forwarding the request & response to "/success" servlet
			
		} else {
			response.getWriter().print("<p><b style=\"color:red;\">Invalid user name and password. Please try again</b></p>");
			request.getRequestDispatcher("welcome").include(request, response);
			//response.getWriter().print("<p><b style=\"color:red;\">End of page</b></p>"); - this line wont be executed/displayed
		}

	}

}
