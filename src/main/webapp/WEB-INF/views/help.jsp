<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.time.LocalDateTime" %>
    
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help page</title>
</head>
<body>

	<%
		/* String name = (String) request.getAttribute("name");
		int rollNumber = (Integer) request.getAttribute("rollNumber");
		LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
	%>

	<h1>Name is <%-- <%=name %> --%> ${ name } </h1>
	<h1>Roll number is <%-- <%=rollNumber %> --%> ${ rollNumber } </h1>
	<h1>Date and time is <%-- <%=time.toString() %> --%> ${ time } </h1>
	
	<hr>
	
	<c:forEach var="item" items="${marks }">
		<%-- <h1>${ item }</h1> --%>
		<h1><c:out value="${ item }"></c:out></h1>
	</c:forEach>
	
	<h1>Help</h1>
</body>
</html>