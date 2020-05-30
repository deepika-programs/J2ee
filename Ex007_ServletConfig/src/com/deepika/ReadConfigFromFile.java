package com.deepika;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadConfigFromFile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		
		ServletConfig sc = getServletConfig();
		PrintWriter out = response.getWriter();
		
		out.print("file name: " + sc.getInitParameter("conf") + "<br>");
		out.print("war file location: " + request.getServletContext().getRealPath("/") + "<br>");
		
		
		FileInputStream fis=new FileInputStream(request.getServletContext().getRealPath("/") + "../" + sc.getInitParameter("conf"));
		Properties prop = new Properties();
		prop.load(fis);
		
		out.print("Data from Properties:");
		out.print(prop.getProperty("database.name")+ "<br>");
		out.print(prop.getProperty("database.username")+ "<br>");
		out.print(prop.getProperty("database.password")+ "<br>");

	}

}
