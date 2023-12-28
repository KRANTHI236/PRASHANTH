<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signup</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/signup" method="post">

<input type="number" name="id" placeholder="enter the id"> <br> <br>
<input type="text" name="name" placeholder="enter the name"> <br> <br>
<input type="text" name="pwd" placeholder="enter the pwd"> <br> <br>
<input type="number" name="phno" placeholder="enter the phno"> <br> <br>
 
<input type="submit">


</form>

</body>
</html>