<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="base.jsp"%>
<meta charset="ISO-8859-1">
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center">Welcome to Product App</h1>

				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Sl. No.</th>
							<th scope="col">Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
							
						</tr>
					</thead>
					<tbody>
					
						<c:forEach items="${products }" var="p">
						<tr>
							<th scope="row">BRIJPUSHPA-${p.id }</th>
							<td>${p.name }</td>
							<td>${p.description }</td>
							<td class="font-weight-bold">Rs. ${p.price}</td>
							<td>
								<a href="delete/${p.id }"><i class="far fa-trash text-danger" style="font-size:20px;"></i></a>
								<a href="update/${p.id }"><i class="far fa-pen-nib text-primary" style="font-size:20px;"></i></a>
					
							</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container text-center">
					<a href="add-prod" class="btn btn-ouline-success">Add Product</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>