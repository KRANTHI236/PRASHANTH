package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
		Statement statement=conn.createStatement();
		statement.execute("insert into  employee values(1,'gopinath',22,7337269707)");
		statement.execute("insert into  employee values(2,'kranthi',21,9988776644)");
		statement.execute("insert into  employee values(3,'madhu',23,9900882266)");
		statement.execute("insert into  employee values(4,'dimple',22,7766440098)");
		statement.execute("insert into  employee values(5,'dinga',23,8833110076)");
		
		
		conn.close();
		System.out.println(" customer table crated");
	}

}
