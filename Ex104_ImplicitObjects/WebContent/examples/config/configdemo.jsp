<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Implicit Object - Config</title>
	</head>
	<body>
	
		<h4>Below value displayed from init-param of servlet using "config" which is implicit object </h4>
		<%= config.getInitParameter("test") %>
	 
	</body>
</html>