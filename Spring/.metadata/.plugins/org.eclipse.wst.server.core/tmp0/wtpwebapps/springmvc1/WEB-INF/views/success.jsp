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
<h1>${Header }</h1>
<h2>${Desc}</h2>

<h1 class="text-centre">Welcome ${user.userName },</h1>
<h1>your email is ${user.email } and password is ${user.password}</h1>
<h1 style="color:green"> ${msg }</h1>
</body>
</html> 