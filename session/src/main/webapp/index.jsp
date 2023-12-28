<html>
<style>
  body {
	margin: 0%;
	padding: 0%;
	background-color:#C4D7B2;
}
.container {
	height: fit-content;
	width: 20%;
	/* border: solid; */
	display: flex;
	align-items: center;
	justify-content: center;
	font-size: 1.7rem;
	margin-left: 38%;
	margin-top:14%;
	border-radius: 10px;
	background-color: rgba(0, 0, 255, 0.222);
	align-content: center;
}
input[type="text"],[type="number"],[type="password"]{
width: 200px;
caret-color:yellow;
color:blue;
background-color: #A2FF86;

}
input[type="submit"]{

background-color: yellow;
}
</style>
<body>
<div class="container" align="center">
<form action="<%= request.getContextPath() %>/demo" method="post">
   <label>Eid:</label>
   <input type="number" name="eid"><br><br>
  <label>Ename:</label>
  <input type="text" name="ename"><br><br>
  <label>Eage:</label>
  <input type="number" name="eage"><br><br>
  <label>Esal:</label>
  <input type="number" name="esal"><br><br>
  <label>Enumber</label>
  <input type="number" name="eno"><br><br>
  <div id="a"><input type="submit"></div>
</form>
</div>
</body>
</html>
