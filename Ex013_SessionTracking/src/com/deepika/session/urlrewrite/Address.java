package com.deepika.session.urlrewrite;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/urladdress")
public class Address extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Html Form Using Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Communication Info</h3>");
		out.println("<form action='urlpayment?fullname="+ request.getParameter("fullname") +"&gender="+ request.getParameter("gender") +"&age="+ request.getParameter("age") +"' method='post'>");
		out.println("<p>Address: <textarea name='address'></textarea></p>");
		out.println("<p>Postal code: <input type='text' name='pincode'></p>");
		out.println("<p><input type='submit' value='Submit'></p>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	
		out.flush();
		out.close();
	}

}
