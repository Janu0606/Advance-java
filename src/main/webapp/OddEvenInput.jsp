<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="OddEvenServlet" method="post">

	Num : <input type="text" name="num"/>${nameError}<br><br> 
	<input type="submit" value="Process"/> 
</body>
</html>