<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${requestScope.message}</h3>
<br>
<br>
<h3>Click this Sign in to get into Online Cart Application</h3>
<a href="./signin.jsp"> <button type=submit>Sign in</button></a>
</body>
<%@ include file="footer.jsp"%>
</html>