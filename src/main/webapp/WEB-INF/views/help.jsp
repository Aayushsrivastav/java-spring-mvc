<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.time.LocalDateTime" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help page</title>
</head>
<body>

	<%
		String name = (String) request.getAttribute("name");
		int rollNumber = (Integer) request.getAttribute("rollNumber");
		LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%>

	<h1>Name is <%=name %></h1>
	<h1>Roll number is <%=rollNumber %></h1>
	<h1>Date and time is <%=time %></h1>
	<h1>Help</h1>
</body>
</html>