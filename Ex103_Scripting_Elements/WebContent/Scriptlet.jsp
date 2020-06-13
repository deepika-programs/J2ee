<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Scriptlet Example</title>
	</head>
	<body>
	
		<%
			for(int i=0; i<5; i++) {
				//out is an implicit object of PrintWriter
				out.println(i + "<br>");
			}
		%>
	
	</body>
</html>