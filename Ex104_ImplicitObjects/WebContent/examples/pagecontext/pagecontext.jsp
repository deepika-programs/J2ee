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
	
		<form action="setformdata.jsp" method="post">
			<p>
				<label>NAME</label> : <input type="text" name="name"> 
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