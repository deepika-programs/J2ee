<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Implicit Object - Session</title>
	</head>
	<body>
	
		<p>Adding a value in session below:</p>
		<%
			session.setAttribute("test", "A value from the session object");
			session.setMaxInactiveInterval(2*60);
		%>
	
	</body>
</html>