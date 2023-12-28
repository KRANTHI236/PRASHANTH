<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome So called Developer</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/welcome" method="post">
<label>For Login:</label>
<input type="submit" value="login" name="login"> <br> <br>
<label>Create Account:</label>
<input type="submit" value="signin" name="login">



</form>


</body>
</html>