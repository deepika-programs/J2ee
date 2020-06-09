package com.deepika;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/htmlform")
public class HtmlForm extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
	
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Html Form Using Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action=\"formdata\" method=\"post\">");
		out.println("<p>User Name: <input type=\"text\" name=\"uname\"></p>");
		out.println("<p>DOB: <input type=\"text\" name=\"dob\"></p>");
		out.println("<p>Age: <input type=\"text\" name=\"age\"></p>");
		out.println("<p>Address: <input type=\"text\" name=\"address\"></p>");
		out.println("<p>Pin: <input type=\"text\" name=\"pin\"></p>");
		out.println("<p><input type=\"submit\" value=\"Submit\"></p>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	
		out.flush();
		out.close();
	}
	

}
