<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Review Page</title>
</head>
<body>
	<h1> Please Leave a Review</h1>
	
	<form action="/submit-review" method="get">
		<p>
			<label for="name-input">Name </label>
			<input name="name" id="name-input"/>
		</p>
		<p>
			<label for="age-input">Comment </label>
			<input name="comment" id="name-input" />
		</p>
		<p>
			<label for="rating-input">Rating:  </label>
			
			5 (Delicious) - 0 (Disgusting)
	<fieldset>
    <span class="star-cb-group">
      <input type="radio" id="rating-5" name="rating" value="5" /><label for="rating-5">5</label>
      <input type="radio" id="rating-4" name="rating" value="4" /><label for="rating-4">4</label>
      <input type="radio" id="rating-3" name="rating" value="3" /><label for="rating-3">3</label>
      <input type="radio" id="rating-2" name="rating" value="2" /><label for="rating-2">2</label>
      <input type="radio" id="rating-1" name="rating" value="1" /><label for="rating-1">1</label>
      <input type="radio" id="rating-0" name="rating" value="0" class="star-cb-clear" /><label for="rating-0">0</label>
  	  </span>
  	</fieldset>
		<p>
			<button type="submit"> Submit</button>
		</p>	
	</form>
		<a href="/"> Go Back </a>
</body>
</html>