<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date, java.util.Calendar" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Import Example</title>
	</head>
	<body>
	
		<h3>Printing the today date Using Date object. Which has been imported using page Import.</h3>
		<%
			Date today = new Date();
		
		
		
		
		
		
		
		
			out.println(today);
			
			
			out.println("<br>");
			
			Calendar c = Calendar.getInstance();
			out.println(c);
		%>
	
	</body>
</html>
