<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Implicit Object - Session</title>
	</head>
	<body>
	
		<h4>Below value displyed from "session" which is implicit object </h4>
		<%= session.getAttribute("test") %>
	
	</body>
</html>