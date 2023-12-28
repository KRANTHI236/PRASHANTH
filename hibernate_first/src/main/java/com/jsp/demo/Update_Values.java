package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update_Values {
	static int id = 30;
	static String name = "hima";
	static int age = 21;

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prashi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		User u = em.find(User.class, id);
		// u.setName(name);
		if (u != null) {
			u.setId(id);
			u.setName(name);
			u.setAge(age);
		}
		et.begin();
		em.merge(u);
		et.commit();
		System.out.println("data updated");
	}
}
