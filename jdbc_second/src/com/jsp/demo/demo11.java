package com.jsp.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class demo11 {

	public static void main(String[] args) {
		try {
			Properties p=new Properties();
			
			FileInputStream f=new FileInputStream("file2.properties");
			
			p.load(f);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first",p);
			
			System.out.println(c);
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}