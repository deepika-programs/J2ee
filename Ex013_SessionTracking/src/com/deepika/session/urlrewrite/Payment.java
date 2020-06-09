package com.deepika.session.urlrewrite;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/urlpayment")
public class Payment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Html Form Using Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Payment Info</h3>");
		out.println("<form action='urlreview?fullname=" + request.getParameter("fullname") 
			+ "&gender=" + request.getParameter("gender") 
			+ "&age=" + request.getParameter("age") 
			+ "&address=" + request.getParameter("address") 
			+ "&pincode=" + request.getParameter("pincode") 
			+ "' method='post'>");
		out.println("<p>Card Number: <input type='text' maxlength='12' name='cardnum'></p>");
		out.println("<p>Expiry Date: <input type='text' name='expdate'></p>");
		out.println("<p>CVV: <input type='text' maxlength='3' name='cvv'></p>");
		
		out.println("<p><input type='submit' value='Submit'></p>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	
		out.flush();
		out.close();
	}

}
