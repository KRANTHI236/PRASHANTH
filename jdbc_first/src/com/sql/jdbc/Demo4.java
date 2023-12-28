package com.sql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo4{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
		Statement s=c.createStatement();
		s.execute("update customer set name='ram' where id=1");
		s.execute("update employee set name='raja' where id=4");
		c.close();
		System.out.println("updated");
		
	}

}
