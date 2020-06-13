<%@ page language="java" errorPage="error.jsp" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%

	if(request.getParameter("name").equals("admin") && request.getParameter("email").equals("pass")) {
		
		response.sendRedirect("success.jsp");
		
	} else {
		
		throw new Exception("Invalid input!");
		
	}

%>