<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<% 
//String name = (String)request.getAttribute("name");
//Integer rollNo = (Integer)request.getAttribute("roll");
//LocalDateTime time=(LocalDateTime)request.getAttribute("time");
%>
My name is 
<%-- <%=name %> --%>
${name}
<hr>
and Roll No. is 
<%-- <%=rollNo%> --%>
${roll}
<hr>
	
Current Time is <%-- <%=time.toString() %>  --%>	
${time}

<hr>
Marks of Students are
<c:forEach var="item" items="${marks}">
<%-- <h1>${item}</h1> --%>
<h2>
<c:out value="${item}"></c:out></h2>
</c:forEach>

</body>
</html>