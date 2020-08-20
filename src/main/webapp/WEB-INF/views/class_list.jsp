<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Class List</h3>
<a href="new_class.htm">New Class</a>
<table>
	<thead>
		<tr>
			<th>No</th>
			<th>Name</th>
			<th>Teacher Name</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${classList }" var="cl" varStatus="row">
			<tr>
				<td>${row.count }</td>
				<td>${cl.name }</td>
				<td>${cl.classTeacher }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>