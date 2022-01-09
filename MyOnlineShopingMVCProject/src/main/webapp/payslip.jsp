<%@page import="com.online.bean.*"%>



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
	<h3>Invoice of your Product!!</h3>
	<table border="1">
		<thead>
			<tr>
				
				<th colspan="2">Product Bill</th>
				<th>TotalCost with GST</th>
			</tr>
		</thead>
		<tbody>

			<tr>
				<td>User Phone</td>
				<td>${requestScope.productpayslip.buyproduct.phone }</td>
				<td rowspan="4">${requestScope.productpayslip.totalcost }</td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td>${requestScope.productpayslip.buyproduct.proname }</td>
			</tr>
			<tr>
				<td>Product Taken</td>
				<td>${requestScope.productpayslip.buyproduct.protaken }</td>
			</tr>
			<tr>
				<td>Cost Per Product</td>
				<td>${requestScope.productpayslip.buyproduct.procost }</td>
			</tr>
		</tbody>

	</table>
	<br>
	<br>
<a href="./main.jsp">Clicker Here For Main Menu</a>
<%@ include file="footer.jsp"%>
</body>
</html>