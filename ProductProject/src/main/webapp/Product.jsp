<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PRODUCT_DETAILS</title>
</head>
<style>
* {
	background-color: FDE5EC;
}

#form {
	display: flexbox;
	justify-content: center;
	margin-top: 200px;
	margin-left: 500px;
}
</style>

<body>
	<div id=form>
		<form action="product" method="post">
			<table>
				<tr>
					<td><label>productName:</label><br></td>
					<td><input type="text" name="name"
						placeholder="enter the productname"><br></td>
				</tr>
				<tr>
					<td><label>productDescription:</label><br></td>
					<td><input type="text" name="description"
						placeholder="enter the productDescription"><br></td>
				</tr>
				<tr>
					<td><label>productPrice:</label><br></td>
					<td><input type="number" name="price"
						placeholder="enter the price "><br></td>
				</tr>
				<td><button>SUBMIT</button></td>
			</table>
		</form>
	</div>
</body>
</html>