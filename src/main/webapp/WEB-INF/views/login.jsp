<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>  
.error{color:red}  
</style>  
</head>
<body>
<form:form action="check_user.htm" modelAttribute="user">  
 <form:errors path = "*" cssClass = "error" element = "div" />
Username: <form:input path="name"/> <br><br>  
Password(*): <form:password path="password"/>    
<form:errors path="password" cssClass="error" /><br><br>  
<input type="submit" value="submit">  
</form:form>  
</body>
</html>