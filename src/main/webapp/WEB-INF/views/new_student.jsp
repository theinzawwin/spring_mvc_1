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
<form:form action="new_student.htm" method="post" modelAttribute="std">
<label>Name</label>
<form:input path="name" /> <br>
<label>Gender:</label><form:radiobutton path="gender" value="Male"/>Male<form:radiobutton path="gender" value="Femal"/>Female<br>

<label>Class</label>
<form:select path="classes.id">
	<c:forEach items="${clList }" var="cl">
	<form:option value="${cl.id }">${cl.name }</form:option>
	</c:forEach>
	
</form:select><br>
<label>Phone</label><form:input path="phone" /><br>
<label>Nrc:</label><form:input path="nrc" /><br>
<label>Email:</label><form:input path="email" /><br>
<label>Address:</label><form:textarea path="address" rows="3" /><br>
<input type="submit" value="Save" />
</form:form>
</body>
</html>