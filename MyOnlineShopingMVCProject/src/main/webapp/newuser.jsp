<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register New User</title>
</head>
<body>
<header>
</header>
<h3>New User Register Here!!</h3>
<main>
<form action="./register" method="post">
			Enter  Email : <input type="email" name="email" required><br>
			<br>
			Enter  Name : <input type="text" name="name"  required><br>
			<br>
			Enter  Phone : <input type="number" name="phone" required><br>
			<br>
			Enter  Password:<input type="password"name="password" required>
			<br>
			<br> <input type="submit" value="Register new user ">
		</form>
		
</main>
<%@ include file="footer.jsp"%>
</body>
</html>