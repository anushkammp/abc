<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>For Each</title>
</head>
<body>

<% 
	String[] num={"one","two","three","four"};
	pageContext.setAttribute("numbers",num);
	%>
	<table  border="1">
	<th>Name</th>
	<th>First Status</th>
	<th>Last Status</th>
	<th>current Status</th>
		<c:forEach var="mynum" varStatus="st" items="${numbers }">
		<tr>
			<td><c:out value="${mynum }"></c:out></td>
			<td><c:out value="${st.first }"></c:out></td>
			<td><c:out value="${st.last }"></c:out></td>
			<td><c:out value="${st.current }"></c:out></td>
		</c:forEach>
	</table>

</body>
</html>