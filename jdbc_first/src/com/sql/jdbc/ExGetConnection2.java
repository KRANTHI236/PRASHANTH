package com.sql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ExGetConnection2 {

	public static void main(String[] args) throws SQLException {
		//connection types 3
		//DriverManager.getConnection(s,s,s)
		//DriverManager.getConnection(s)
		//DriverManager.getConnection(s,properties n)
		DriverManager.registerDriver(new Driver());
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first?user=root&password=root");
		
		System.out.println("connection done");
				
		
		
		
	
	}

}
