<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp"%>
	<main>
		<form action="./buyproduct" method="post">
			Enter  Product Name : <input type="text" name="proname"><br><br>
			Enter  User Phone : <input type="text" name="phone"><br><br>
			Enter  Number of Products : <input type="text" name="protaken"><br><br>
			<br> <input type="submit" value="Buy product">
		</form>
	</main>
	<%@ include file="footer.jsp"%>
</body>
</html>