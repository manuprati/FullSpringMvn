<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> ${student.name}</h1>
<h1> ${student.id}</h1>
<h1> ${student.courses}</h1>
<h1> ${student.gender}</h1>
<h1> ${student.date}</h1>
<h1> ${student.type}</h1>
<h1> ${student.address.street}</h1>
<h1> ${student.address.city}</h1>

</body>
</html>