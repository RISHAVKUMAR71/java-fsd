<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User feedback form</title>
</head>
<body>

	<h2>User feedback form</h2>

	<form action="registeruser" method="post">
		<pre>
		Name: <input type="text" name="name" />
		Email: <input type="text" name="email" />
		Feedback: <input type="text" name="feedback" />
		<input type="submit" name="Register" />
		</pre>
	</form>
	
	<p><%= request.getAttribute("result") %></p>
	<br/>
	<ul>
		<c:forEach var="user" items="${users}">
			<li>${user.id} | ${user.name} | ${user.email} | ${user.feedback}</li>
		</c:forEach>
	</ul>
</body>
</html>	