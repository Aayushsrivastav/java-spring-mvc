<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.List"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>Home page</h1>
	<h1>url /home</h1>
	
	<%
		String name = (String) request.getAttribute("name");
		int id = (Integer) request.getAttribute("id");
		List<String> friends = (List<String>) request.getAttribute("friends");
	%>
	
	<h1>Id is <%=id %></h1>
	<h1>Name is <%=name%></h1>
	
	<%
		for(String f : friends){
	%>
			<h1><%=f %></h1>
	<%
		}
	%>
</body>
</html>