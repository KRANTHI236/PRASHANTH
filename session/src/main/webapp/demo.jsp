<%@page import="com.session.Fetch_Data"%>
<%@page import="com.session.Dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
input[type="text"] {
	border: none;
	width: 40px;
	background-color: skyblue;
}

body {
	background-color: #FFEADD;
	margin: 0%;
	padding: 0%;
}

div {
	margin-top: 200px;
	width: auto;
	height: auto;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

input[type="submit"] {
	background-color: yellow;
}

table input[type="text"] {
	border: none;
	background-color: #A2FF86;
	width: 60px;
}

table {
	background-color: #A2FF86;
}

th {
	color: #4C4B16;
}

td {
	color: #898121;
}

.id {
	background-color: #9FE2BF;
}
</style>
<body>
	<table border="" align="center" cellpadding="20px">
		<thead>
			<tr>
				<div class="div">
					<th>Eid</th>
					<th>Ename</th>
					<th>Eage</th>
					<th>Esal</th>
					<th>Eno</th>
				</div>
			</tr>
		</thead>
		<tbody>
			<%!List<Dto> li;%>
			<%
			List<Dto> li = Fetch_Data.fetch(request);
			%>
			<%
			for (Dto d : li) {
			%>
			<form action="<%=request.getContextPath()%>/action" method="post">
				<tr>
					<td><input type="text" name="id" value="<%=d.getEid()%>"></td>
					<td><input type="text" name="name" value="<%=d.getEname()%>"></td>
					<td><%=d.getEage()%></td>
					<td><%=d.getEsal()%></td>
					<td><%=d.getEno()%></td>
					<td id="id"><input type="submit" value="Update" name="action">
					</td>
					<td class="class"><input type="submit" value="Delete"
						name="action"></td>
				</tr>
			</form>
			<%
			}
			%>
		</tbody>
	</table>
</body>
</html>