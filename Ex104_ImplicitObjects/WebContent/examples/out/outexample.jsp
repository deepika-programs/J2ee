<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Implicit Object - Out</title>
	</head>
	<body>
	
		<%
			out.println(10);
			out.println("<br>");
			out.println("<strong>Hello</strong>");
			out.println("<br>");
			out.println(10.5);
			out.println("<br>");
		%>
		
		<!-- out object can be replaced with expression tag like below -->
		<%= 10 %>
		
		<br>
		
		<%= 'Y' %>
		
		<br>
		
		<%= true %>
		
		<br>
		
		<%= "Hi" %>
		
		<br>
		
		<%= 100+50 %>
		
	
	</body>
</html>