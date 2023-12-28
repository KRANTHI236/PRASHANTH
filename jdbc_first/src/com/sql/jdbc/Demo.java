package com.sql.jdbc;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

class Demo
{
public static void main(String[] args) {
	

	
	try {
		
		
		/*Properties p=new Properties();
		
		FileInputStream fs=new FileInputStream("user.properties");
		
		p.load(fs);*/
		
		//load or register the driver
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		DriverManager.registerDriver(new Driver());
		
		//establish the connection
		
	    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first?user=root&password=root");
		
        //Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
        
        //Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first",p );
        
        //establish the statement 
        
        Statement s=c.createStatement();
        //insert into values
        //s.execute("create table student1(id integer primary key,name varchar(45),age integer)");
       // s.execute("insert into student values (1,'kiran',22)");
       // s.execute("insert into student values(2,'kranthi',20)");
        s.execute("insert into student values(3,'jai',22)");
        //s.execute("insert into student values(4,'deep',29)");
        
        System.out.println("insertion successfull");
        //update the values
       /* s.executeUpdate("update  student  set name='hima' where name='jai' ");
        
        System.out.println("updation successfull");*/
        
        //delete the values
        
        /*Statement s=c.createStatement();
        
        s.execute("DELETE FROM student where name='hima' ");
       
        
        
        System.out.println("deletion successfull");*/
	    
	    //selection based on id
	    
	    /*Statement s=c.createStatement();
	    
	    
	    s.execute("select * from student");
	    
	    System.out.println("selection successfully");
	    */
        
        
        c.close();
        
        
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}	
}