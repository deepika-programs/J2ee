<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login</title>
	<style>
		td,th { padding: 5px 15px; }	/* Syntax: padding: (top&bottom) (right&left); */
		#error, #er { color: red; }
	</style>
	<script type="text/javascript" src="myscript.js"></script>
	<script>
		
		function validate() {
			if(document.getElementById("email").value.trim()=="" || !isValidEmail(document.getElementById("email").value.trim())) {
				//alert("email should not be blank and should be with valid format");
				document.getElementById("error").innerHTML = "email should not be blank and should be with valid format";
				document.getElementById("email").focus();
				document.getElementById("email").style.borderColor="red";
				return false;
			}
			if(document.getElementById("pass").value.trim()=="") {
				//alert("password should not be blank")
				document.getElementById("error").innerHTML = "password should not be blank";
				document.getElementById("pass").focus();
				document.getElementById("pass").value="";
				document.getElementById("pass").style.borderColor="red";
				return false;
			}
		}
		
		function clearError(){
			document.getElementById("error").innerHTML = "";
		}
		
	</script>
</head>
<body>
	<div id="error"></div>
	<p id="er"><%= request.getParameter("err")!=null ? "Invalid credential. Try Again!!" : "" %></p>
	<form action="login" method="post" onsubmit="return validate()">
		<table border="1" style="border-collapse: collapse;">
			<tr>
				<th colspan="2" style="text-align: center;">Login Form</th>
			</tr>
			<tr>
				<td>email</td>
				<td><input type="text" id="email" name="email" onkeyup="clearError()"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="password" id="pass" name="password" onkeypress="clearError()"></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
					<input type="reset" onclick="clearError()" value="clear">
					<input type="submit" value="submit">
				</td>
			</tr>
			
		</table>
	
	
	
	</form>
</body>
</html>

<!-- 

to use other form fields can use

password for "password" field
Hobbies for "checkbox"
Gender for "radio" field

 -->