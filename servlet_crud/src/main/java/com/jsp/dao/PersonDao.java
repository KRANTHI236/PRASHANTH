package com.jsp.dao;

import com.jsp.dto.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.*;

public class PersonDao {

	public Person SavePerson(Person p) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/servlet_crud?user=root&password=root");

			PreparedStatement preparedStatement = c.prepareStatement("insert into person values(?,?,?,?,?)");

			preparedStatement.setInt(1, Person.getId());
			preparedStatement.setString(2, Person.getName());
			preparedStatement.setInt(3, Person.getage());
			preparedStatement.setString(4, Person.getemail());
			preparedStatement.setString(5, Person.getpasswordl());

			int res = preparedStatement.executeUpdate();

			// c.close();

			return p;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Person UpdatePerson(Person p) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/servlet_crud?user=root&password=root");

			PreparedStatement preparedStatement = c.prepareStatement("update person set name=?,age=? where id=?");

			preparedStatement.setString(1, Person.getName());
			preparedStatement.setInt(2, Person.getage());
			preparedStatement.setInt(3, Person.getId());
			// preparedStatement.setString(4, Person.getemail());
			// preparedStatement.setString(5, Person.getpasswordl());

			int res = preparedStatement.executeUpdate();

			// c.close();

			return p;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	public int deletePerson(int id) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/servlet_crud?user=root&password=root");

			PreparedStatement preparedStatement = c.prepareStatement("delete from person  where id=?");

			preparedStatement.setInt(1, Person.getId());
			// preparedStatement.setString(1, Person.getName());
			// preparedStatement.setInt(2, Person.getage());
			// preparedStatement.setString(4, Person.getemail());
			// preparedStatement.setString(5, Person.getpasswordl());

			int res = preparedStatement.executeUpdate();

			c.close();

			return res;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	public List<Person> getAllPerson() {

		List<Person> list = new ArrayList<Person>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/servlet_crud?user=root&password=root");

			Statement s = c.createStatement();

			ResultSet rs = s.executeQuery("select * from person");
			while (rs.next()) {
				Person person = new Person();

				person.setId(rs.getInt(1));
				person.setname(rs.getString(2));
				person.setage(rs.getInt(3));

				list.add(person);

			}

			c.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public Person getPersonById(int id) {
		Person p = new Person();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/servlet_crud?user=root&password=root");

			PreparedStatement preparedStatement = c.prepareStatement("select * from person where id=?");

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				p.setId(rs.getInt(1));
//			 p.setname(rs.getString(2));
//			 p.setage(rs.getInt(3));

			}
			c.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return p;

	}
}
