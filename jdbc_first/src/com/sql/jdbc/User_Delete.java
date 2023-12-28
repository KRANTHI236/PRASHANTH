package com.sql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class User_Delete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first", "root", "root");

			PreparedStatement ps = c.prepareStatement("DELETE FROM  stud  WHERE id=?");

			boolean b = true;

			while (b) {

				/*
				 * System.out.println("enter the name"); String s=sc.next(); ps.setString(1, s);
				 */
				System.out.println("enter the id");
				int n = sc.nextInt();
				ps.setInt(1, n);
				System.out.println("do u want another row");
				char ch = sc.next().charAt(0);

				switch (ch) {
				case 'Y': {
					b = true;

					/*
					 * System.out.println("deleteion based on id"); int n1=sc.nextInt();
					 * ps.setInt(1, n1);
					 */
					break;
				}
				}
				switch (ch) {
				case 'N': {
					b = false;
					/*
					 * System.out.println("deleteion based on id"); String s1=sc.next();
					 * ps.setString(2,s1);
					 */
					break;
				}
				}
			}
			ps.executeUpdate();

			c.close();

			System.out.println("start delete");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}