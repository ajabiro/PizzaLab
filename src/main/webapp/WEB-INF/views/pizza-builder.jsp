<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Build Your Own Pizza</title>
</head>
<body>
	<h1>Build Your Own Pizza</h1>
	<form action="/submit-pizza-builder" method="get">
		<p>
		  <label for="size">Choose a size:</label>
 			 <select name="size">
   			 <option value="small">Small</option>
   			 <option value="medium">Medium</option>
    		 <option value="large">Large</option>
    		 </select>
		</p>
		<p>
			<label for="toppings-input">How Many Toppings? </label>
			<input name="toppings" id="name-input" />
		</p>
		<label for="glutenfree-input">Gluten-Free Crust? (additional $2) </label>
		<input type="checkbox" id="name-input" name="glutenfree" value="yes">
		<p>
			<label for="instructions-input">Special Instructions (optional): </label>
			<input name="instructions" id="name-input" />
		</p>
	
		<p>
		 <button type="submit">Calculate Price</button> 
		</p>	
		</form>
	
	<a href="/"> Go Back </a>
</body>
</html>