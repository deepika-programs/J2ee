<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Expression Example</title>
	</head>
	<body>
	
		<%
		
			String output = "Hello" + " World";
		
		%>
	
	
		<%= "Hello World!" %>
		<br>
		<%= 5+10 %>
		<br>
		<%= 'Y' + ": Yes" %>
		
		<br>
		<%= output %>
		
		<br>
		<%= request.getParameter("msg") %> <!-- To receive value for this, call this jsp like "expression.jsp?msg=value" -->
		
	
	</body>
</html>