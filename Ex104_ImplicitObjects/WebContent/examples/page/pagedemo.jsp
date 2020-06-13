<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Implicit Object - Page</title>
	</head>
	<body>
	
		<%=page.toString() %>
		
		<%
			pageContext.setAttribute("key", "Some value for this page alone!", PageContext.PAGE_SCOPE);
		%>
		
		<p>
		
		<%= pageContext.getAttribute("key", PageContext.PAGE_SCOPE) %>
	
		</p>	
	
	</body>
</html>