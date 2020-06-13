<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Implicit Object - pagecontext</title>
		<style type="text/css">
			label { float: left; width: 130px; }
		</style>
	</head>
	<body>
	
		<h3>
			Value from Request Scope: <%= pageContext.getAttribute("msg", PageContext.REQUEST_SCOPE) %>
		</h3>
		<h3>
			Value from Session Scope: <%= pageContext.getAttribute("msg", PageContext.SESSION_SCOPE) %>
		</h3>
		<p>
			<label>NAME</label> : <%= pageContext.getAttribute("user", PageContext.SESSION_SCOPE) %>
		</p>


</body>
</html>