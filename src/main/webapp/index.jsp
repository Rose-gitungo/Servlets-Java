<%@page import="tech.csm.entity.Bank"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank Registration form</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<nav>
		<div class="navbar navbar-expand-lg navbar-light bg-light">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="createBank.html">Create Bank</a></li>
				<li class="nav-item"><a class="nav-link"href="createAccount.jsp" >Create Account</a></li>
				<li class="nav-item"><a class="nav-link" href="Transaction.jsp">Transact</a></li>
			</ul>
		</div>
	</nav>
	<!-- diplaying all my banks -->
	<div class="container">
		<div class="mt-5">

			<h2>Available Banks</h2>
			<table class="table table-bordered table-striped">
				<thead class="thead-light">
					<tr>
						<th>Bank ID</th>
						<th>Bank Name</th>
						<th>Bank IFSC Code</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${bankList}" var="bank" varStatus="counter">
						<tr>
							<td>${counter.count}</td>
							<td>${bank.bankName}</td>
							<td>${bank.IFSC}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>

	</div>
</body>
</html>