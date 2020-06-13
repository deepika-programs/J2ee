
<%-- 
	In this page we are able to see 2 implicit objects.
	1. out
	2. request
 --%>

<%

	out.println(request.getParameter("name"));
	out.println("<br>");
	out.print(request.getParameter("email"));

%>

<br>

<%= request.getParameter("contno") %>

<br>

<%= request.getParameter("pwd") %>