<%@page import="com.pojos.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SHOW</title>
</head>
<body>

<%
	List<Employee> emp=(List<Employee>)request.getAttribute("employee");
%>
<table>
<tr>
<th>EmpID</th>
<th>Name</th>
<th>Salary</th>
</tr>
<%
	for(Employee e:emp)
		{
%>
		<tr>
		<td><%out.print(e.getEmpID());%></td>
		<td><%out.print(e.getName());%></td>
		<td><%out.print(e.getSalary());%></td>
		</tr>
		
<%
		}
%>
</table>
</body>
</html>