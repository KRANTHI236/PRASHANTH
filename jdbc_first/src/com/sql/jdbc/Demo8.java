package com.sql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Demo8 {

	public static void main(String[] args) throws SQLException {
		
		DriverManager.registerDriver(new Driver());
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
        
		Statement s=c.createStatement();
		
		boolean b= s.execute("select* from employee where id=10");
		
		c.close();
		
		System.out.println("executed successfully");
		
		System.out.println(b);
		
	}

}
