package com.sql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first?user=root&password=root");
		
		PreparedStatement p=c.prepareStatement("insert into employee values(?,?,?,?)");
		
		p.setInt(1, 5);
		p.setString(2, "sai");
		p.setInt(3, 25);
		p.setLong(4, 7337269708l);
		p.executeUpdate();
		c.close();
		System.out.println("data inserted");
		
		

	}

}
