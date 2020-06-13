
<%-- 
	In this page we are able to see 2 implicit objects.
	1. request
	2. response
 --%>

<%

	if(request.getParameter("name").equals("admin") && request.getParameter("pwd").equals("pass")) {
		
		System.out.println("Condition satisfied...");
		
		request.getRequestDispatcher("successpage.jsp").forward(request, response);
		
	} else {
		
		//response implicit object
		
		response.sendRedirect("respexample.jsp");
		
	}


%>
