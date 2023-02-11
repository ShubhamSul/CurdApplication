<%@page import="ATdev.std.admin.model.Student" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
*{
 margin-top: 30px;
  margin-left: 20px;
  }
td{
width:25px;
height:25px;
font-size:25px;
}
a{
font-size:25px;
}
</style>
</head>
<body style="background-color: #E8A87C;" link="red" vlink="black" alink="yellow">
<%!List<Student> lst = null;
	Student std = null;%>

	<%
	lst =(List<Student>)  session.getAttribute("stdlst");
		session.invalidate();
%>
<table border="3px" background="gray">
	<%		
		for(Student std:lst){
	%>
	
		<tr>
			<td><%=std.getStdID()%></td>
			<td><%=std.getStdName()%></td>
			<td><%=std.getStdAge()%></td>
			<td><%=std.getDept()%></td>
			
		</tr>

	<%} %>
	</table>
	<br>
	<br>
		
				<a href="DashboardAdmin.html">Home</a>
				</body>
</head>
<body>

</body>
</html>