<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Practice Page</title>
</head>
<body>

<% String username = request.getParameter("username");
  if (username != null) { %>
   <h1>Hello, <%= username %>.</h1>
 <% } else { %>
   <h1>Hello ... please login!</h1>
 <% } %>

 <%--
//http://localhost:8080/jstl
//http://localhost:8080/jstl?username=amanda

///page will print hello.. please log in 
//if it is not null (!=) it will print hello, amanda or whatever username 
--%>


<h1> Hello, <c:out default="please login." value="value"$param['username']}" /></h1>
 <%--
//this above is the jstl way of doing it 
--%>



<h2>Choose fruits</h2>
 <form method="get">
  <input type="checkbox" name="key" value="apple">apple
  <input type="checkbox" name="key" value="pear">pear
  <input type="checkbox" name="key" value="banana">banana
  <input type="checkbox" name="key" value="strawberry">strawberry
  <input type="checkbox" name="key" value="blueberry">blueberry
  <br />
  <br />
  <input type="submit" value="submit">
 </form>
 <h2>Your selected fruits are:</h2>
 <%
 String[] fruits = request.getParameterValues("key");
 if (fruits != null) {
  for (String fruit : fruits) {
  %>
  <i><%= fruit %></i> <br />
  <%
  }
 }
 <h2> Your selected fruits are: </h2>
 <c:forEach car="value" item="${paramValues['key']}">
	<i><c:out value="${value} /><?i><br />"
	</c:forEach>
 %>
</body>
</html>