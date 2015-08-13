<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Appointment Acceptance</title>
</head>
<body>
	<h1>Add Request</h1>
	<hr />
	<form:form method="post" commandName="request" action="appointmentadd.htm">
		<table>
			<tr>
				<td>Enter Blood Bank ID: </td>
				<td><form:input path="bid" /> <form:errors path="bid" /></td>
			</tr>
			<tr>
				<td>Enter Name: </td>
				<td><form:input path="name" /> <form:errors path="name" /></td>
			</tr>
			<tr>
				<td>Enter Blood Group: </td>
				<td><form:input path="nbloodgroup" /> <form:errors path="nbloodgroup"/>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>
	<a href="index.jsp">home</a>
	
	
</body>
</html>

