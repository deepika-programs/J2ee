<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Declaration Example</title>
	</head>
	<body>
	
		<%! 
			String output=null;
			int a=0;
		%>
	
	
		<%
			if((3+2)==5) {
				output = "Value is 5";
			}
			a++;
		%>
	
		<br>
		<%= output %>
		
		<p>
			<small>
				Number of times the page accessed <%= a %>
			</small>
		</p>
	
	</body>
</html>