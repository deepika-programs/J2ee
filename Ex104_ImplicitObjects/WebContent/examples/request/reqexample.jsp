<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Implicit Object - request</title>
		<style type="text/css">
			label { float: left; width: 130px; }
		</style>
	</head>
	<body>
	
		<form action="requestdemo.jsp" method="post">
			<p>
				<label>NAME</label> : <input type="text" name="name"> 
			</p>
			<p>
				<label>E-mail</label>: <input type="text" name="email">
			</p>
			<p>
				<label>Contact Number</label>: <input type="text" name="contno">
			</p>
			<p>
				<label>Password</label>: <input type="password" name="pwd">
			</p>
			<p>
				<input type="submit" value="Submit">
			</p>
		</form>


</body>
</html>