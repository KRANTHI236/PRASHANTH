package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class ExecuteQuery {
public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
		
		Statement statement=connection.createStatement();
		
		ResultSet rs=statement.executeQuery("select * from employee ");
		
		while(rs.next()) {
			System.out.println("employee id:"+rs.getInt(1));
			System.out.println("employee name:"+rs.getString(2));
			System.out.println("employee age:"+rs.getInt(3));
			System.out.println("employee phone:"+rs.getLong(4));
			//System.out.println("employee id:"+rs.getInt(1));
			
		}
		
		connection.close();
		
		
		
		
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}

//with the help of the throws 
