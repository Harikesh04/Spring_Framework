<%@page import="com.saswat.spring.springmvcjavaconfig.dto.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>collection type</title>
</head>
<body>
	<h1>this is to send a list from controller to ui</h1>
	<%
	ArrayList<Employee> employeeList = (ArrayList<Employee>) request.getAttribute("employeeList");

	for (Employee emp : employeeList) {
		out.println(emp.getId());
		out.println(emp.getName());
		out.println(emp.getSalary());
	}
	%>
</body>
</html>