package com.sql.jdbc;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class User_Input {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//System.out.println("we are testing the code is working or not");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
			//System.out.println("enter the name");
			//Statement statement=conn.createStatement();
			//String str=sc.nextLine();
			Boolean b=true;
			//char ch=sc.next().charAt(0);
			//int a=sc.nextInt();
			
			//statement.execute("create table"+" "+str+"(id int primary key,name varchar(30))");
			//System.out.println("insert values");
			while(b)
			{	
			PreparedStatement s=conn.prepareStatement("insert into stud values(?,?)");
			System.out.println("enter the id");
			int n=sc.nextInt();
			s.setInt(1, n);
			System.out.println("enter the name");
			String str1=sc.next();
			s.setString(2, str1);
			System.out.println("do you want to add next row");
			char ch=sc.next().charAt(0);
			//char ch=sc.next().charAt(0);
			switch(ch)
			{
			case 'Y':
				    b=true;
				 
			}
			switch(ch)
			{
			case 'N':
			    b=false;
			}
			s.execute();
			}
			conn.close();
			System.out.println("start inserting");
		
		
		}
		
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	

}
