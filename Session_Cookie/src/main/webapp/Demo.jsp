<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Registration Form</title>
</head>

<style>
*{
background-color: pink;

}
 #form{
     display:flexbox; 
     justify-content: center;
     margin-top: 200px;
     margin-left: 500px;

 }
</style>
<body>
<form action="<%= request.getContextPath() %>/display" method="post">

<div id="form">
<input type="number" name="id" placeholder="enter the id"  required="required"> <br> <br>
<input type="text" name="name" placeholder="enter the name" required="required"> <br> <br>
<input type="number" name="num" placeholder="enter the num" required="required"> <br> <br>
<input type="text" name="mail" placeholder="enter the mail" required="required"> <br> <br>
<input type="password" name="pwd" placeholder="enter thepwd" required="required"> <br> <br>
<input type="submit" value="insert">
 
</div>
   
</form>

</body>
</html>