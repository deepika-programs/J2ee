package com.deepika.session.hiddenformfield;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/review")
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
		out.println("<form action='save' method='post'>");
		
		out.println("<h4>Personal Detail</h3>");
		
		out.println("<div><i>Full Name :</i> "+ request.getParameter("fullname") +"</div>");
		out.println("<input type='hidden' value='" + request.getParameter("fullname") + "' name='fullname'>");
		
		out.println("<div><i>Gender :</i> "+ request.getParameter("gender") +"</div>");
		out.println("<input type='hidden' value='" + request.getParameter("gender") + "' name='gender'>");
		
		out.println("<div><i>Age :</i> "+ request.getParameter("age") +"</div>");
		out.println("<input type='hidden' value='" + request.getParameter("age") + "' name='age'>");
		
		out.println("<h4>Address Detail</h3>");
		out.println("<div><i>Address :</i> "+ request.getParameter("address") +"</div>");
		out.println("<input type='hidden' value='" + request.getParameter("address") + "' name='address'>");
		out.println("<div><i>Pincode :</i> "+ request.getParameter("pincode") +"</div>");
		out.println("<input type='hidden' value='" + request.getParameter("pincode") + "' name='pincode'>");
		
		out.println("<h4>Card Detail</h3>");
		out.println("<div><i>Card Number :</i> "+ request.getParameter("cardnum") +"</div>");
		out.println("<input type='hidden' value='" + request.getParameter("cardnum") + "' name='cardnum'>");
		out.println("<div><i>Expiry Date :</i> "+ request.getParameter("expdate") +"</div>");
		out.println("<input type='hidden' value='" + request.getParameter("expdate") + "' name='expdate'>");
		out.println("<div><i>CVV :</i> "+ request.getParameter("cvv").replaceAll("[0-9]", "*") +"</div>");
		out.println("<input type='hidden' value='" + request.getParameter("cvv") + "' name='cvv'>");
		
		
		out.println("<p><input type='submit' value='Submit'></p>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	
		out.flush();
		out.close();
	}

}
