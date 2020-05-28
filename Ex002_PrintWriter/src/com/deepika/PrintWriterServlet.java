package com.deepika;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/printwriter")
public class PrintWriterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doget method");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Html Page Using Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello!</h1>");
		out.println("<h4>Welcome!!</h4>");
		out.println("</body>");
		out.println("</html>");
		
		out.flush();
		out.close();
		
	}

}
