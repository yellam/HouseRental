<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LogIn</title>
<link rel="stylesheet" href="Home.css">
</head>
<body>

	<div id="header">
		<div id="rental">
			<h1>RentalPortal</h1>
		</div>
		<div id="reg">
			<a href="Registration.jsp" style="color: red"><h2>Registration</h2></a>
			<div id="log">
				<a href="HomePage.jsp" style="color: red"><h2>HomePage</h2></a>
			</div>
		</div>
	</div>

	<form name="loginform" action="LogInServlet" method="post" onsubmit="return logInValidate()">
		<div id="log">
			<h2>LogIn</h2>
		</div>


		<div id="logmenu">
			<table>
				<tr>
					<td><label>Email</label></td>
					<td><input type="email" name="email" value="${param.email}" pattern="[a-zA-Z0-9_$#]{1,}+@[a-zA-Z]{5,7}+.[a-z]{3,6}"></td>
					<td><span style="color:red" id="emailerror"></span></td>
					<td><span style="color:red">${errorMessages.emailerror}</span></td>
					
				</tr>
				<tr>
					<td><label>password</label></td>
					<td><input type="password" name="password" value="${param.password}" pattern="[a-zA-z0-9@$#]{8,20}"></td>
						<td><span style="color:red" id="passworderror"></span></td>
					<td><span style="color:red">${errorMessages.passworderror}</span></td>
				
				</tr>
			</table>
		</div>
		<div id="sub">
			<center>
				<input type="Submit" value="LogIn">
			</center>
		</div>
	</form>
	<script type="text/javascript" src="validation.js"></script>
</body>
</html>