package com.deepika;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Html Form Using Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action=\"check\" method=\"post\">");
		out.println("<p>User Name: <input type=\"text\" name=\"uname\"></p>");
		out.println("<p>Password: <input type=\"password\" name=\"pwd\"></p>");
		out.println("<p><input type=\"submit\" value=\"Submit\"></p>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

		out.flush();
		out.close();

	
	}

}
