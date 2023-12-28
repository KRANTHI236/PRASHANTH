package com.sql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
		Statement statement=conn.createStatement();
		statement.execute("insert into employee values(1,'gopinath',22,65431728)");
		statement.execute("insert into employee values(2,'kranthi',21,678975)");
		statement.execute("insert into employee values(3,'madhu',23,987654323)");
		statement.execute("insert into employee values(4,'kira',20,123456)");
		
		
		conn.close();
		System.out.println("employee table crated");
	}

}
