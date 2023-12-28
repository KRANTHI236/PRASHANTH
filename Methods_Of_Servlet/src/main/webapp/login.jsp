<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

<form action="<%= request.getContextPath() %>/Login" method="post">

<input type="number" name="phno" placeholder="enter the phno"> <br> <br>

<input type="text" name="pwd" placeholder="enter the pwd"> <br> <br> 

<input type="submit">







</form>

</body>
</html>