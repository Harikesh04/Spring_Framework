<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.saswat.spring.springmvc.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>controller to ui</title>
</head>
<body>
	<h3>user registrated successfully</h3>
	<%
	User user = (User) request.getAttribute("user");
	%>
	ID :
	<strong> <%=user.getId()%></strong> Name :
	<strong> <%=user.getName()%></strong> Email :
	<strong> <%=user.getEmail()%></strong>
</body>
</html>