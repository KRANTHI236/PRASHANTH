<html>
<body>
	<h2>Hello World!</h2>
	<form action="<%= request.getContextPath() %>/dept" method="post">

		enter the did: <input type="number" name="did"> <br>
		enter the dname: <input type="text" name="dname"> <br>
		enter the loc: <input type="text" name="loc"> <br> 
		<input type="submit">

	</form>
</body>
</html>
