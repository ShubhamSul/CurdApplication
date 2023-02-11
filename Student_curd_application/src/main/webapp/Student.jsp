<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
form{
font-size:25px;
}
</style>
</head>

<body style="background-color: #E8A87C;" link="red" vlink="black" alink="yellow">
<%! String str=null; %>
<form action="StudentController">
<table>
<tr>
<td>Student ID</td>
<td><input type="text" name="stdId"></td>
</tr>

<tr>
<td>Student Name</td>
<td><input type="text" name="stdName"></td>
</tr>

<tr>
<td>Student Age</td>
<td><input type="text" name="stdAge"></td>
</tr>

<tr>
<td>Student department</td>
<td><input type="text" name="dept"></td>
</tr>

<tr>
<td><input type="submit" name="prodQty"></td>
</tr>
</table>
</form>

<div>
<%
str=(String)session.getAttribute("msg");
session.invalidate();
%>
<h1><%=str %></h1>
</div>
<a href="DashboardAdmin.html">Home</a>
</body>
</html>