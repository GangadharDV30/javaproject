<%@page import="com.online.bean.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp"%>
	<main>
		<table border="1">
			<thead>
				<tr>
					<th>Product ID</th>
					<th>Product Name</th>
					<th>Product Cost</th>
					<th>Product Avail</th>

				</tr>
			</thead>
			<c:forEach items="${requestScope.productslist}" var="product">
				<tr>
					<td>${product.proid }</td>
					<td>${product.pname }</td>
					<td>${product.procost }</td>
					<td>${product.proavail }</td>
				</tr>
			</c:forEach>
		</table>
		<br>

	</main>

</body>
<%@ include file="footer.jsp"%>
</html>
