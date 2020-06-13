<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Implicit Object - application</title>
	</head>
	<body>
	
		<h4>
			Below value displyed from context-param of application/web.xml using "application" which is implicit object.
			This is same as servletContext in servlet example. 
		</h4>
		<%= application.getInitParameter("dbname") %>
	
	</body>
</html>