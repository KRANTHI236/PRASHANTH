package com.jsp.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExSelect {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
			Statement s=connection.createStatement();
     		CallableStatement callableStatement=connection.prepareCall("call third_code(?)");
		    callableStatement.setInt(1, 1);
		    ResultSet rs=s.executeQuery("select * from employee where id=3 ");
		    while(rs.next()) {
		    	
		    	System.out.println("id "+rs.getInt(1));
		    	System.out.println("name "+rs.getString(2));
		    	System.out.println("age "+rs.getInt(3));
		    	System.out.println("phno "+rs.getLong(4));
		    	
		    }
		   
		
			callableStatement.execute();
			
			connection.close();
			//System.out.println("selected ");
			
		} catch (ClassNotFoundException | SQLException e) {
		   e.printStackTrace();
		}
	}

}
