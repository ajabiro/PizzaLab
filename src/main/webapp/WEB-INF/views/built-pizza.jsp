<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Finished Pizza</title>
</head>
<body>
	<h1>Your Custom Pizza</h1>
	<p> Size: ${ size } </p>
	<p> Toppings: ${ toppings } </p>
	<p> Gluten-Free? ${ glutenfree} </p>
	<p> Special Instructions: ${ instructions } </p>
	<p> Price : $ ${price}</p>
	
	
	<a href="/"> Go Back to Home Page </a>
	<p>
	<a href="/pizza-builder"> Build Another Pizza </a>
	</p>
</body>
</html>