package com.session;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Fetch_Data {
	public static List<Dto> fetch(javax.servlet.http.HttpServletRequest req) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("magician");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Dto d2 = new Dto();
		Query q = em.createQuery("select e from Dto e");
		List<Dto> l = q.getResultList();
		return l;
	}
}
