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
<form action="Deletecontroller">
Enter Student Id: <input type="text" name="stdID"><br>
<input type="submit" value="Delete"><br>
</form>
<%!String str=null; %>
<%
str=(String)session.getAttribute("dstd");
session.invalidate();%>
<h1><%=str %></h1><br>
<a href="DashboardAdmin.html">Home</a>
</body>
</html>