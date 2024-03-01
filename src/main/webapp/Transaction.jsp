<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>transact</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<nav>
		<div class="navbar navbar-expand-lg navbar-light bg-light">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
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
				<h2 class="text-warning text-center">Transaction Form</h2>
			</div>
			<div class="card-body">
				<form method="post" action="transact">
					<div class="row mt-5">
						<div class="col-5">
							<label class="font-weight-bold"> Transaction Id</label> <input
								type="text" name="tId" class="form-control">
						</div>
						<div class="col-5">
							<label class="font-weight-bold">Transaction type</label> <input
								type="text" name="regNo" class="form-control">
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