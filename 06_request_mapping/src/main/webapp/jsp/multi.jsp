<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multi Action</title>
</head>
<body>	
	<h1>Multi Action Controller</h1>
	<p> ${not empty message ? message : 'Default Action'} </p>
	
	<ul>
		<li>
			<c:url value="multi/action1" var="action1"></c:url> 
			<a href="${action1}"> Action 1</a> 
		</li>
		<li> 
			<c:url value="/multi/action1 ? id=10" var="action11"></c:url>
			<a  href="action11">Action 1 with ID</a> 
		</li>
		<li> 
			<c:url value="/multi/action2" var="action2"></c:url>
			<a  href="${action2}">Action 2</a>
		</li>
		<li> 
			<c:url value="/multi/100" var="digit"></c:url>
			<a  href="${digit}">Path with Digit</a> 
		</li>
		<li> 
			<c:url value="/multi/sadfef" var="wild"></c:url>
			<a  href="${wild}">Wild Card</a> 
		</li>
	</ul>
</body>
</html>