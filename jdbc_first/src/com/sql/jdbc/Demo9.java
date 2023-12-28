package com.sql.jdbc;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo9 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first?user=root&password=root");
			
			PreparedStatement p=c.prepareStatement("delete from employee where id=?");
			
			//p.setString(1, "cherry");
			p.setInt(1, 2);
			p.executeUpdate();
			c.close();
			
			System.out.println("deleted");
			
					
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
