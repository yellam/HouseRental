<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="Home.css">
</head>
<body>
<form action="" method="post">
<div id="Register">
<h1>Registration</h1>
</div>
<div id="menu">
<table>
<tr>
<td><label>FullName</label></td>
<td><input type="text" name="fullname"></td>
</tr>
<tr>
<td><label>Email</label></td>
<td><input type="email" name="email"></td>
</tr>
<tr>
<td><label>MobileNumber</label></td>
<td><input type="tel" name="mobile"></td>
</tr>

<tr>
<td><label>Owner</label></td>
<td><input type="radio" name="asowner" >AS Owner</td>
<td><input type="radio" name="asowner" >AS Tenent</td>
</tr>

<tr>
<td><label>username</label></td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td><label>password</label></td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td><label>confirmpassword</label></td>
<td><input type="text" name="confirmpassword"></td>
</tr>
</table>

<div id="secondregbutton">
<input type="submit" value="Registration">
</div>
</div>


</form>
</body>
</html>