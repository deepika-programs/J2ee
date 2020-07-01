package com.deepika;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check")
public class Check extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if(req.getParameter("uname").equals("admin")&& req.getParameter("pass").equals("admin")) {
			
			String fullName = "Deepika";
			
			req.setAttribute("name", fullName);
			req.setAttribute("yob", 1996);
			
			req.getRequestDispatcher("success.jsp").forward(req, resp);
			
		} else {
			resp.sendRedirect("error.jsp");
		}
	}

}
