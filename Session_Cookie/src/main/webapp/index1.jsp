<%@page import="java.util.List"%>

<%@page import="com.sessoin.Dto"%>


<%@page import="com.sessoin.Fetch_Data"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>

#table{

background-color: pink;
align-items: center;
justify-content:center ;
margin : auto;


}
</style>
<body>


	<h2>Hello World!</h2>



<div id="table">
	 <table border="5">
	 
			<tr>
				<th>id</th>
				<th>name</th>
				<th>num</th>
				<th>mail</th>
				<th>pwd</th>
			</tr>
			
			<tbody>
			
			<%! List<Dto> li; %>
			
<% li=Fetch_Data.fetch(request); %>			
			<% for(Dto d1:li) 
			{%>
			
             <form action="<%= request.getContextPath() %>/update" method="post">
			<tr>
			
			<td>
			<%! int id=0; %>
			<% id=d1.getId(); %>
		    <input type="text" name="eid" value="<%= d1.getId() %>"  >
			</td>
			
			<td>
			<%! String name=""; %>
			<% name=d1.getName(); %>
			<input type="text" name="name" value="<%= d1.getName() %>">
			<%-- <%= name %> --%>
			</td>
			
			<td>
			<%! long num=0L; %>
			<% num=d1.getPhno(); %>
			<%= num %>
			</td>
			
			<td>
			<%! String mail=""; %>
			<% mail=d1.getGmail(); %>
			<%= mail %>
			</td>
			
			<td>
			<%! String pwd=""; %>
			<% pwd=d1.getPwd(); %>
			<%= pwd %>
			</td>
			<td>
			<input type="submit" value="update" name="update">
			
			</td>
			
			</tr>
			</form>
			
			
		<% } %>
		
		
		</tbody>
			
			
			
		</table>
		</div
		>
<input type="submit" name="display">


</body>

</html>

</body>
</html>