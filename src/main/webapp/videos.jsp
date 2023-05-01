<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>

	<%
		if(session.getAttribute("mostafa") == null)
			response.sendRedirect("Login.jsp");	
	%>

	<div>Hello in Videos Page ...</div>

	<a href="Logout"> Log out</a> </br>
	
	<a href="home.jsp" > Home </a> Page</br>
	
	<a href="aboutUS.jsp" > About Us </a> Page</br>
	
	<a href="login.jsp" > login </a> Page

</body>
</html>