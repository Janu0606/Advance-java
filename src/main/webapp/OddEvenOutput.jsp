<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${message}
	${num}
	
	<br>
	<br>
	<%
	String msg = (String) request.getAttribute("message");
	%>
	<%=msg == null ? "" : msg%>


	<%
	int num = (Integer) request.getAttribute("num");//Object
	%>
	<%=num%>
	<br>
	<br>
	<%
	for (int i = 1; i <= num; i++) {
		for (int j = 1; j <= i; j++) {
	%>
	<%=j%>
	<%
	}
	%>
	<br>
	<%
	}
	%>


	<br>
	<br>


	<%
	int x=10;
	for (int i = 1; i <= num; i++) {
		for (int j = 1; j <= i; j++) {
			out.print(j);	 
		}
		out.print("<br>");

	}
	%> 
 
</body>
</html>