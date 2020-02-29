<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@include file="WelcomeHouserental.jsp" %>

<div id="tableform">
<c:if test="${details.size()>0}">
<table border="1" style="border-collapse:collapse">
<tr>
<th>house</th>
<th>squareFeet</th>
<th>rentalCost</th>
<th>parkingAvailable</th>
<th>garden</th>
<th>address</th>
</tr>

<c:forEach var="userdetails" items="${details}">
<tr>
<td>${userdetails.house}</td>
<td>${userdetails.squareFeet}</td>
<td>${userdetails.rentalCost}</td>
<td>${userdetails.parkingAvaliable}</td>
<td>${userdetails.garden}</td>
<td>${userdetails.address}</td>

</tr>
</c:forEach>
</table>
</c:if>
</div>

</body>
</html>