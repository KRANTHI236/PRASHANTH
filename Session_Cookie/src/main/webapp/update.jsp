<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Updation</title>
</head>
<body>

<form action="<%= request.getContextPath() %>/update_action" method="post">

<input type="text" value="<%= request.getSession().getAttribute("id") %>" name="id">

<%= request.getSession().getAttribute("name") %>

<select name="update">

    <option>select option </option>
    <option value="id">id</option>
    <option value="name">name</option>
    <option value="phno">phno</option>
    <option value="gmail">gmail</option>
    <option value="pwd">pwd</option>
    
 </select>
 
 <input type="text" name="option"> 
 <input type="submit">






</form>
</body>
</html>