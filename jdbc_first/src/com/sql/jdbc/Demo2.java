package com.sql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
		Statement statement=conn.createStatement();
		statement.execute("insert into customer values(1,'gopinath',22)");
		statement.execute("insert into customer values(2,'kranthi',21)");
		statement.execute("insert into customer values(3,'madhu',23)");
		statement.execute("insert into customer values(4,'abc',22)");
		
		
		conn.close();
		System.out.println(" customer table crated");
	}

}
