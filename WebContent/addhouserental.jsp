<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Home.css">
</head>
<body>
<div id="logoutid">
<a href="logout"><button style="color:red">LOGOUT</button></a>
</div>

<div id="addhousehead">
<center>
<form action="addhouserental" method="post"  enctype="multipart/form-data">

<div id="addhousemenu">
<h1>AddHouseRental</h1>
</div>
<table>
<tr>
<td><label>HouseType</label></td>
<td><select name="house">
  <option value="none">none</option>
  <option value="1BHK">1BHK</option>
  <option value="2BHK">2BHK</option>
  <option value="3BHK">3BHK</option>
</select></td>
</tr>
<tr>
<td><label>SquareFeet</label></td>
<td><input type="text" name="squareFeet"></td>
<td><span style="color:red">${errorMessages.squareFeeterror}</span></td>
</tr>
<tr>
<td><label>RentalCost</label></td>
<td><input type="text" name="rentalCost"></td>
<td><span style="color:red">${errorMessages.rentalCosterror}</span></td>
</tr>
<tr>
<td><label>ParkingAvaliable</label></td>
<td><input type="text" name="parkingAvaliable"></td>
<td><span style="color:red">${errorMessages.parkingAvaliableerror}</span></td>
</tr>
<tr>
<td><label>Garden</label></td>
<td><input type="text" name="garden"></td>
<td><span style="color:red">${errorMessages.gardenerror}</span></td>
</tr>
<tr>
<td><label>Address</label></td>
<td><textarea name="address" rows="5" cols="50"></textarea></td>
<td><span style="color:red">${errorMessages.addresserror}</span></td>
</tr>
<tr>
<td><label>Image</label></td>
<td><input type="file" name="houseImage"></td>
</tr>


</table>
<div id="addhousesub">
<input type="submit" value="submit">
</div>
</form>
</center>
</div>
</body>
</html>