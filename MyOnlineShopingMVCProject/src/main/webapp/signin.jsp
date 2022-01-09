<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header>
		<h1>Online Cart System</h1>
	</header>
	<main>
	<form   action="./signin" method="post" >
		Enter PhoneNumber : <input type="text" name="uname"><br>
		<br> Enter Password : <input type="password" name="pwd"><br>
		<br> <input type="submit" value="sign in">
	</form>
	<br>
	<h3>If you are new user please click here to Register!!</h3>
	<br>
	
	<a href="./newuser.jsp"> <button type=submit>New User</button></a>
	</main>
	<footer>
		<h5>Copyright content of Online Cart &copy; </h5>
		<h6>Registered trademark Batch 4 &reg; </h6>
	</footer>

</body>
</html>