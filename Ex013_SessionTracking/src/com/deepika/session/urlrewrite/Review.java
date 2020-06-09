package com.deepika.session.urlrewrite;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/urlreview")
public class Review extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Html Form Using Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Review All Info</h3>");
		out.println("<form action='urlsave?fullname=" 
				+ request.getParameter("fullname") 
				+ "&gender=" + request.getParameter("gender") 
				+ "&age=" + request.getParameter("age") 
				+ "&address=" + request.getParameter("address") 
				+ "&pincode=" + request.getParameter("pincode") 
				+ "&cardnum=" + request.getParameter("cardnum") 
				+ "&expdate=" + request.getParameter("expdate") 
				+ "&cvv=" + request.getParameter("cvv") 
				+ "' method='post'>");
		
		out.println("<h4>Personal Detail</h3>");
		
		out.println("<div><i>Full Name :</i> "+ request.getParameter("fullname") +"</div>");
		out.println("<div><i>Gender :</i> "+ request.getParameter("gender") +"</div>");
		out.println("<div><i>Age :</i> "+ request.getParameter("age") +"</div>");
		
		out.println("<h4>Address Detail</h3>");
		out.println("<div><i>Address :</i> "+ request.getParameter("address") +"</div>");
		out.println("<div><i>Pincode :</i> "+ request.getParameter("pincode") +"</div>");
		
		out.println("<h4>Card Detail</h3>");
		out.println("<div><i>Card Number :</i> "+ request.getParameter("cardnum") +"</div>");
		out.println("<div><i>Expiry Date :</i> "+ request.getParameter("expdate") +"</div>");
		out.println("<div><i>CVV :</i> "+ request.getParameter("cvv").replaceAll("[0-9]", "*") +"</div>");
		out.println("<p><input type='submit' value='Submit'></p>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	
		out.flush();
		out.close();
	}

}
