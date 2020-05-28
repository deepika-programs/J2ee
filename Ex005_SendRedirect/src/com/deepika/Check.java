package com.deepika;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/check")
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		/*send redirect--
		 * 	just redirects the response to another page( doesn't consider whether the page exists or not)
		 * 	it works within and outside the server
		 *             eg:response.sendRedirect("http://google.com");-->outside the server
		 *                response.sendRedirect("any_servlet_page");-->inside the server
		 *  always redirects as a new request  to another page.
		 *  Post request cannot be send through send redirect, always uses Get.
		 *  SendRedirect---method from response obj  
		 *  RequestDispatcher---method from request obj         
		 */
		
		
		if (request.getParameter("uname").equals("admin") && request.getParameter("pwd").equals("pass")) {
			System.out.println(request.getParameter("uname"));
			System.out.println(request.getParameter("pwd"));
			response.sendRedirect("success");
		} else {
			response.sendRedirect("http://dolakkkk.com");
		}

	}
}
