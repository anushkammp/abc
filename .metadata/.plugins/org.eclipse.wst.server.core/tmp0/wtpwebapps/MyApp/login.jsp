<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>

<%
String mesg=(String)request.getAttribute("msg");
%>
<%=mesg %>


<form action="check" method="get">

USERNAME:<input type="text" name="username">
<br>
PASSWORD:<input type="text" name="password">
<br>
<input type="submit" value="LOGIN">

</form>

</body>
</html>