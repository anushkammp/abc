<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read Cookie</title>
</head>
<body>

<%
	Cookie[] cs=request.getCookies();
	for(Cookie c:cs)
	{
		if(c.getName().equals("msg1"))
			out.println("Cookie found"+c.getValue());
	}
%>

</body>
</html>