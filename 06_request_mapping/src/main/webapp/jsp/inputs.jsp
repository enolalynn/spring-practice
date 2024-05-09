<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Input</title>
</head>
<body>
	
	<h1>User Inputs</h1>
	<div>
		<c:if test="${not empty type and not empty id }">
			<h3>${type} / ${id}</h3>
		</c:if>
	</div>
	<ul>
		<li>
			<c:url value="/inputs/Path Type/search/10011" var="pathLink"></c:url>
			<a href="${pathLink}">Path Variable</a>
		</li>
	</ul>
	
	
</body>
</html>