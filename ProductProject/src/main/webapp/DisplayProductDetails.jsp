<%@page import="DTO.ProductDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DISPLAY_PRODUCT_DETAILS</title>
</head>
<body>

	<%
	List<ProductDto> pd = (List) request.getAttribute("product");
	%>
	<table border="2px">

		<tr>

			<th>ProdutId</th>
			<th>ProductName</th>
			<th>ProductDescription</th>
			<th>productPrice</th>
			<th>Delete</th>

		</tr>
		<%
		for (ProductDto productDto : pd) {
		%>
		<tr>

			<td><%=productDto.getProductId()%></td>
			<td><%=productDto.getProductName()%></td>
			<td><%=productDto.getProductDescription()%></td>
			<td><%=productDto.getProductPrice()%></td>

			<td><a href="delete?id=<%=productDto.getProductId()%>"><button>DELETE</button></a></td>



		</tr>
		<%
		}
		%>


	</table>

</body>
</html>