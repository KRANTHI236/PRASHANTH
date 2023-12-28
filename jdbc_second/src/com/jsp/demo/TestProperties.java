package com.jsp.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		
		try {
			
			Properties p=new Properties();
			
			FileInputStream f=new FileInputStream("configure.properties");
			
			p.load(f);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first", p);
			
			System.out.println(c);
			
			
			
			
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
		
	}

}
