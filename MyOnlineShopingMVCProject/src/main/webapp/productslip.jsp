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
		<form action="./payslip" method="post">
			Enter  User Phone : <input type="text" name="phone"><br><br>
			Enter  Product Name : <input type="text" name="proname"><br><br>
			<br> <input type="submit" value="Generate Bill">
		</form>
	</main>
	<%@ include file="footer.jsp"%>

</body>
</html>