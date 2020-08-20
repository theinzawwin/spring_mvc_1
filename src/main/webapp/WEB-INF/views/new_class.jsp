<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="new_class.htm" method="post" modelAttribute="classes">
<label>Name</label>
<form:input path="name" /> <br>
<label>Class Teacher</label>
<form:input path="classTeacher" /> <br>
<input type="submit" value="Save" />
</form:form>
</body>
</html>