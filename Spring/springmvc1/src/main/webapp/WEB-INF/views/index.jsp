<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h2>Called by home controller</h2>
	<h3>url /home</h3>
	<%
		String name= (String)request.getAttribute("name");
		Integer id= (Integer) request.getAttribute("Id");
		List<String> friends = (List<String>)request.getAttribute("f");
	%>
	<h2>Name is <%=name%></h2>
	<h2>Id is <%=id%></h2>
	<%
		for(String s:friends){
			%>
			<h1><%=s%></h1>
			<%
		}
	%>

</body>
</html>