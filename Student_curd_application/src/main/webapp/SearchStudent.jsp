<%@page import="ATdev.std.admin.model.Student" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: #E8A87C;" link="red" vlink="black" alink="yellow">
	<form action="SearchStudentController">
		Enter Student Id <input type="text" name="stdId"><br> <input
			type="submit" value="Search">
	</form>

	<%!List<Student> lst = null;
	Student std = null;%>

	<%
	Object o = session.getAttribute("std");
	if (o instanceof List) {
		lst = (List <Student>) o;
		session.invalidate();
		if (lst != null) {
			std= lst.get(0);
			lst = null;
	%>
	<table border=1.5px>
		<tr>
			<td><%=std.getStdID()%></td>
			<td><%=std.getStdName()%></td>
			<td><%=std.getStdAge()%></td>
			<td><%=std.getStdAge()%></td>
		</tr>
	</table>
	<%
	}
	} else {
	String str = (String) o;
	out.println(str);
	}
	%>
	<br>
		<a href="DashboardAdmin.html">Home</a>
</body>
</html>