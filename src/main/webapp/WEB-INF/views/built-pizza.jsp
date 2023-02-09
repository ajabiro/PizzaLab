<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Finished Pizza</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h1>Your Custom Pizza</h1>
	<p> Size: ${size} </p>
	<p> Toppings: ${toppings} </p>
	<p> Gluten-Free? ${glutenfree} </p>
	<p> Special Instructions: ${instructions} </p>
	<p> Price : <c:out value="${price}" /></p>
	
	<c:if test="${price > 15}">
	<h2 style="color:red; font-size:50px">  Your order is over the $ 15.00 minimum, you get 
		<br> ..... FREE DELIVERY ..... </h2>
	</c:if>
	
	<a href="/"> Go Back to Home Page </a>
	<p>
	<a href="/pizza-builder"> Build Another Pizza </a>
	</p>
</body>
</html>