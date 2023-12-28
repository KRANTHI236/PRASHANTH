<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
    body{
     background-color: #FCAEAE;
     margin: 0%;
     padding:0%;
     align-content: center;
    }
    option{
    background-color: #45CFDD;
    align:center;
    }
</style>
<body>
	<form action="<%= request.getContextPath() %>/updser" method="post">
		<span>
			<p>
				<b>Emp Id:</b>
			<p>
				<input type="text" value="<%=request.getSession().getAttribute("id")%>" name="id">
		</span>
		<p>
			<b>Name:</b>
			<%=request.getSession().getAttribute("name")%></p>
		<select name="update">
			<option>Select field</option>
			<option value="Ename">Name</option>
			<option value="Eage">Age</option>
			<option value="Esal">Salarly</option>
			<option value="Eno">Number</option>
		</select> <input type="text" name="field"> <input type="submit">
	</form>
</body>
</html>