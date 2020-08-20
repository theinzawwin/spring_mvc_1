<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
</head>
<body>
<h3>Student List</h3>
<a href="new_student.htm">New Student</a>
<table>
	<thead>
		<tr>
			<th>No</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Gender</th>
			<th>Class</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${students }" var="std" varStatus="row">
			<tr>
				<td>${row.count }</td>
				<td>${std.name }</td>
				<td>${std.email }</td>
				<td>${std.phone }</td>
				<td>${std.gender }</td>
				<td>${std.classes.name }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>