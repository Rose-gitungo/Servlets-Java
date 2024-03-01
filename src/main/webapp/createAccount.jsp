<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create account page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<nav>
		<div class="navbar navbar-expand-lg navbar-light bg-light">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="index">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="createBank.html?link=clicked">Create Bank</a></li>
				<li class="nav-item"><a class="nav-link"
					href="createAccount.jsp?link=clicked">Create Account</a></li>
				<li class="nav-item"><a class="nav-link"
					href="Transaction.jsp?link=clicked">Transact</a></li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<div class="mt-5 card">
			<div class="card-header">
				<h2 class="text-warning text-center">Bank Account Registration
					Form</h2>
			</div>
			<div class="card-body">
				<form method="post" action="createAccount">
					<div class="row mt-5">
						<input type="hidden" name="accountNo">
						<div class="col-4">
							<label class="font-weight-bold">Account Name</label> <input
								type="text" name="name" class="form-control">
						</div>
						<div class="col-4">
							<label class="font-weight-bold">Phone No</label> <input
								type="text" name="phoneNo" class="form-control">
						</div>
						<div class="col-4">
							<label class="font-weight-bold">Email ID</label> <input
								type="text" name="emailId" class="form-control">
						</div>
						<div class="col-4">
							<label class="font-weight-bold">Account type</label> <select
								name="accountType" class="form-control">
									<option value="0">--select--</option>
								<option value="withdraw">Withdraw</option>
								<option value="deposit">Deposit</option>
							</select>
						</div>
						<div class="col-4">
							<label class="font-weight-bold">Bank</label>
							 <select name="bank" class="form-control">
								<c:forEach var="bank" items="${bankList}">
									<option value="${bank.bankId}">${bank.bankName}</option>
								</c:forEach>
							</select>
						</div>
						<div class="col-4">
							<label class="font-weight-bold">Balance</label> <input
								type="text" name="balance" class="form-control">
						</div>

					</div>
					<div class="mt-2 text-center">
						<input type="submit" class=" btn btn-success">
					</div>

				</form>
			</div>
		</div>
	</div>
</body>
</html>