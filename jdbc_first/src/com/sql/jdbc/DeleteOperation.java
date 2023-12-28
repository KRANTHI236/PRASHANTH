package com.sql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteOperation {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first?user=root&password=root");
			
			PreparedStatement p=c.prepareStatement("update employee set name=? ,age=?,phone=? where id=?");
			
		
			
			p.setString(1, "cherry");
			p.setInt(2, 20);
			p.setLong(3, 6786637282l);
			p.setInt(4, 5);
			p.setString(1, "kranthi");
			p.setInt(2, 21);
			p.setLong(3,846352672929l);
			p.setInt(4, 1);
			p.setString(1, "kiran");
			p.setInt(2, 22);
			p.setLong(3, 83635287292l);
			p.setInt(4, 4);
			p.setString(1, "pa1");
			p.setInt(2, 25);
			p.setLong(3, 9876543321l);
			p.setInt(4, 5);
			p.setString(1, "jaideep");
			p.setInt(4, 2);
			
			
			int res=p.executeUpdate();
			c.close();
			System.out.println(res);
			if(res>0) {
				System.out.println("data updated");
				
			}else {
				System.out.println("plz check id");
			}
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}


	}

}
