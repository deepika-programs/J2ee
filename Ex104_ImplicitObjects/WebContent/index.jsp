<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<!-- "internal css". This is applicable for only this page's design -->
		<style type="text/css">
			body {
				padding: 0;
				margin: 0px;
			}
			ul {
				list-style-type: none;
				margin: 65px auto;
				padding: 0;
				display: block;
				overflow: auto;
				width: 600px;
				border: 1px solid red;
			}
			li {
				float: left;
				margin: 10px;
			}
			a {
				text-decoration: none;
				display: block;
				padding: 25px;
				/* background-color: lightblue; */
				color: black;
				border-radius: 35px;
				width: 125px;
				height: 35px;
				text-align: center;
				
				background: -webkit-linear-gradient(top,  #b4e391 0%,#61c419 50%,#b4e391 100%);
			}
			
			a:hover {
				color: darkred;
				background: -webkit-linear-gradient(top,  #d0e4f7 0%,#73b1e7 24%,#0a77d5 50%,#539fe1 79%,#87bcea 100%);
			}
</style>
	</head>
	<body>
		
		
		<ul>
			<li>
				<a href="examples/out/outexample.jsp">out-JspWriter</a>
			</li>
			<li>
				<a href="examples/request/reqexample.jsp">request-HttpServletRequest</a>
			</li>
			<li>
				<a href="examples/response/respexample.jsp">response-HttpServletResponse</a>
			</li>
			<li>
				<a href="config">config-ServletConfig</a>
			</li>
			<li>
				<a href="examples/application/applicationdemo.jsp">application-ServletContext</a>
			</li>
			<li>
				<a href="examples/session/sessiondemo.jsp">session-HttpSession</a>
			</li>
			<li>
				<a href="examples/pagecontext/pagecontext.jsp">pageContext-PageContext</a>
			</li>
			<li>
				<a href="examples/page/pagedemo.jsp">page-Object</a>
			</li>
			<li>
				<a href="examples/exception/form.jsp">exception-Throwable</a>
			</li>
		</ul>
		<!-- inline css. This is applicable only for the specific element -->
		<!-- 
			<span style="background-color: red;">test asdff asdsf asdfd asdff asdf</span>
			<span style="background-color: green;">test asdff asdsf asdfd asdff asdf</span>
		-->
	</body>
</html>