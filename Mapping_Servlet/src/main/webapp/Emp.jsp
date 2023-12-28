<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration form</title>
</head>
<style>
    
   *{
    background-color: lightcyan;
   }
   #hello{
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
    }
    #select{
        margin-left: -90px;
    }
    #submit{
       margin-left: 80pxpx;
    }
    #content{
        margin-top: 180px;
        margin-left: 200pxpx;
    }

</style>
<body>
<form action="<%= request.getContextPath() %>/emp" method="post">
<div id="content">
     <div id="hello"><h2>Hello Employees</h2>
    
        <div>  <input type="number" name="id" placeholder="enter the id"></div> <br>
	    <div>  <input type="text" name="name" placeholder="enter the name"> </div> <br>
	    <div>  <input type="number" name="empnum" placeholder="enter the empnum"></div> <br>

	    <div id="select"><select name="dept"> </div>
        <option value="1">Developer</option> 
        <option value="2">Tester</option> 
        <option value="3">Designer</option> 
        </select> <br> <br>
    </div>
        
    <div id="submit"><input type="submit"> </div><br> <br>
</div>
</form>
</body>
</html>