package com.jsp.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DeleteStatement {
	public static void main(String[] args) {
		try {
			Properties properties=new Properties();
			FileInputStream fileInputStream=new FileInputStream("file2.properties");
			properties.load(fileInputStream);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first",properties);
			
			CallableStatement callableStatement=connection.prepareCall("call second_code(?)");
			
			callableStatement.setInt(1, 4);
			
			callableStatement.execute();
			
			connection.close();
			System.out.println("deleted successfully");
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
	}
}
