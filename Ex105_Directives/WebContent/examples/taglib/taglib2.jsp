<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Taglib example</title>
</head>
<body>


	<table border="1">

		<%
			for (int row = 0; row < 5; row++) {
		%>

		<tr>

			<%
				for (int col = 0; col < 5; col++) {
			%>
				<td> <%=col%> </td>
			<%
				}
			%>
			
		</tr>
		
		<%
			}
		%>

	</table>

<br>

	<table border="1">
		<c:forEach var="row" begin="1" end="5" step="1">
			<tr>
				<c:forEach var="col" begin="1" end="3" step="1">
					<td>${row} - ${col} </td>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>



</body>
</html>