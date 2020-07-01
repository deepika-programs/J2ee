<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Registration</title>
	<style>
		td,th { padding: 5px 15px; }	/* Syntax: padding: (top&bottom) (right&left); */
		#er { color: red; font-weight: bold; } /* "#" is for "id" selector. "." is for class selector */
		#msg { color:green; font-weight: bold;}
	</style>
	<script type="text/javascript" src="myscript.js"></script>
	<script>
		function validate() {
			// alert(document.regform.name.value); //document.formName.fieldName.value
			// alert(document.forms[1].name.value);  //document.forms[n th form].fieldname.value
			// alert(document.forms[1].elements[0].value);  //document.forms[n th form].elements[n th field].value
			console.log(document.forms[0].elements.length);
			for(var i=0; i<document.forms[0].elements.length; i++) {
				var curElem = document.forms[0].elements[i];
				if(curElem.type!="reset" && curElem.type!="submit" && curElem.name!="hobbies") {
					//console.log(curElem);
					if(curElem.value=="") {
						alert("Missing " + curElem.name + ". Please Try Again...!");
						curElem.focus();
						return false;
					} else if(curElem.name=="dob" && !isValidDate(curElem.value)) {
						alert("Invalid DOB. Please Try Again...!");
						curElem.focus();
						return false;
					} else if(document.forms[0].gender.value=="") {
						alert("Missing Gender. Please Try Again...!");
						return false;
					} else if(curElem.name=="email" && !isValidEmail(curElem.value)) {
						alert("Invalid Eamil Address. Please Try Again...!");
						curElem.focus();
						return false;
					}
					
				}
			}
			
			return confirmation();
		}
		function confirmation(){
			//var conf=confirm("Are you sure, Do you want to submit the form?");
			return confirm("Are you sure, Do you want to submit the form?");
		}
		
	</script>
</head>
<body>
	<p id="er"><%= request.getAttribute("err")!=null ? "Missing Mandatory Fields! Pleases Try Again with Valid Input!!" : "" %></p>
	<p id="msg"> 
	<% 
		for(Cookie c : request.getCookies()) {
			if(c.getName().equals("message")){
				out.println(c.getValue().replaceAll("-"," "));
			}
		}
	%>
	</p>
	<form name="regform" action="register" method="post" onsubmit="return validate()">
		<table border="1" style="border-collapse: collapse;">
			<tr>
				<th colspan="2" style="text-align: center;">Registration Form</th>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="name" value="<%= (request.getParameter("name")==null) ? "" : request.getParameter("name") %>"></td>
			</tr>
			<tr>
				<td>dob</td>
				<td><input type="text" name="dob" placeholder="dd/mm/yyyy" value="<%= request.getParameter("dob")==null ? "" : request.getParameter("dob") %>"></td>
			</tr>
			<tr>
				<td>Nationality</td>
				<td> 
					<select name="nationality">
						<option value=""  <%= request.getParameter("nationality")==null ? "selected" : "" %>>Select</option>
						<option value="I" <%= request.getParameter("nationality")!=null && request.getParameter("nationality").equalsIgnoreCase("I") ? "selected" : "" %>>India</option>
						<option value="O" <%= request.getParameter("nationality")!=null && request.getParameter("nationality").equalsIgnoreCase("O") ? "selected" : "" %>>Outside India</option>
					</select> 
				</td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>
					<input type="radio" <%= request.getParameter("gender")!=null && request.getParameter("gender").equalsIgnoreCase("F") ? "checked" : "" %> name="gender" value="F" id="female"> <label for="female">Female</label>
					<input type="radio" <%= request.getParameter("gender")!=null && request.getParameter("gender").equalsIgnoreCase("M") ? "checked" : "" %> name="gender" value="M" id="male"> <label for="male">Male</label>
				</td>
			</tr>
			<tr>
				<td>email</td>
				<td><input type="text" name="email" value="<%= request.getParameter("email")==null ? "" : request.getParameter("email")  %>"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Hobbies</td>
				<td>
					<label for="music">Music</label> 
					<%
						String[] hobbies = request.getParameterValues("hobbies");
						List<String> hobbyList = null;
						if(hobbies!=null && hobbies.length>0) {
							hobbyList = Arrays.asList(hobbies);
						}
					%>
					<input type="checkbox" id="music" name="hobbies" <%= hobbyList != null && hobbyList.contains("Music") ? "checked" : "" %> value="Music">
					<label for="game">Game</label> 
					<input type="checkbox" id="game" name="hobbies" <%= hobbyList != null && hobbyList.contains("Game") ? "checked" : "" %> value="Game">
					<label for="dance">Dance</label> 
					<input type="checkbox" id="dance" name="hobbies" <%= hobbyList != null && hobbyList.contains("Dance") ? "checked" : "" %> value="Dance">
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
					<input type="reset" value="clear">
					<input type="submit" value="submit">
				</td>
			</tr>
			
		</table>
	
	</form>
	
	<form name="searchform" onsubmit="return validate()">
		search: <input type="text" name="name1">
		<input type="submit" value="submit">
	</form>
	
</body>
</html>

<!-- 

to use other form fields can use

password for "password" field
Hobbies for "checkbox"
Gender for "radio" field

 -->