<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>I'm Home page</title>
</head>
<body>

	<%
		if(session.getAttribute("mostafa") == null)
			response.sendRedirect("login.jsp");	
	%>

	<div>Hello in the Home Page ...</div>
	
	<a href="videos.jsp" > Videos </a> Page </br>
	
	<a href="aboutUS.jsp" > About Us </a> Page </br>
	
	<a href="login.jsp" > Login </a> Page

</body>
</html>