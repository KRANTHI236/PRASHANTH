package com.jsp.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class ExCallable {
	public static void main(String[] args) {
		try {
			Properties properties=new Properties();
			FileInputStream fileInputStream=new FileInputStream("configure.properties");
			properties.load(fileInputStream);
			DriverManager.registerDriver(new Driver());
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first",properties);
					
		    CallableStatement callableStatement=connection.prepareCall("call first_code(?,?,?,?)");
			
			callableStatement.setInt(1, 26);
			callableStatement.setString(2, "simple");
			callableStatement.setInt(3, 25);
			callableStatement.setLong(4, 76543542344l);
			
			callableStatement.execute();
			
			connection.close();
			
			System.out.println("date insertion successfully");
			
		} catch (SQLException | IOException e) {
	      e.printStackTrace();
		}
	}

}
