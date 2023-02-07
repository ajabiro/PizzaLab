<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aranda's Pizza</title>
</head>
<body>
 	<h1>Welcome to Aranda's Pizza!</h1>
 	<h2> Specialty Pizza </h2>
 	<ul>
 	<li> <a href="/specialty?name=Hawaiian Pizza&price=19.00"> Hawaiian Pizza</a> </li>
 	<li> <a href="/specialty?name=Meat Lover's Pizza&price=21.00"> Meat Lover's Pizza </a> </li>
    <li> <a href="/specialty?name=Triple Cheese&price=17.00"> Triple Cheese Pizza</a> </li>
 	</ul>
	
	<h2>Create Your Own Pizza</h2>
	<a href="/pizza-builder"> Build a Custom Pizza </a>
	
	<h2>Let Us Know How We're Doing</h2>
	<a href="/review"> Leave us a Review</a>
	
</body>
</html>