package com.jsp.dto;

public class Person {
	private static int id;
	private static String name;
	private static int age;
	private static String email;
	private static String password;

	public static int getId() {
		return id;
	}

	public void setId(int id) {
		Person.id = id;
	}

	public static String getName() {
		return name;
	}

	public void setname(String name) {
		Person.name = name;
	}

	public static int getage() {
		return age;
	}

	public void setage(int age) {
		Person.age = age;
	}

	public static String getemail() {
		return email;
	}

	public void setemail(String email) {
		Person.email = email;
	}

	public static String getpasswordl() {
		return password;
	}

	public void setpassword(String password) {
		Person.password = password;
	}

}
