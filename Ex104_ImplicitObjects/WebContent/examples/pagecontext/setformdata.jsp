<%

	String uname = request.getParameter("name");

	pageContext.setAttribute("user", uname, PageContext.SESSION_SCOPE);
	
	pageContext.setAttribute("msg", "Welcome "+uname, PageContext.REQUEST_SCOPE);
	pageContext.setAttribute("msg", "Welcome "+uname, PageContext.SESSION_SCOPE);
	
	request.getRequestDispatcher("getformdata.jsp").forward(request, response);

%>