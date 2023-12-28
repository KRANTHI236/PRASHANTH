package com.jsp.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExSelectAll {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
			CallableStatement callableStatement=connection.prepareCall("call fourth_code(?)");
			
		    callableStatement.execute("select * from employee");
		    connection.close();
		    System.out.println("selected");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
