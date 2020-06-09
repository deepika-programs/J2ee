package com.deepika;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formdata")
public class FormData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Html Form Using Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		
		Enumeration<String> en = request.getParameterNames();
		while(en.hasMoreElements()) {
			String p = en.nextElement();
			out.println("<p>" + p + " : " + request.getParameter(p) + "</p>");
		}
		
		
		out.println("</body>");
		out.println("</html>");

		out.flush();
		out.close();

	}

}
