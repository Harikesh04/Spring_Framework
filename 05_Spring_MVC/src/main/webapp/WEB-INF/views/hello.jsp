<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>primitive type</title>
</head>
<body>
	<h1>welcome to spring mvc</h1>
	<h3>this is hello.jsp page</h3>
	<h4>sending primitive types data from controller to ui</h4>
	<!-- 1st method -->
	<%
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Integer salary = (Integer) request.getAttribute("salary");
	out.println(id);
	out.println(name);
	out.println(salary);
	%>

	<!-- 2nd method - jsp expression language -->

<%--
	id : <b>${id}</b>
	name : <b>${name}</b>
	salary : <b>${salary}</b> 
--%>
</body>
</html>