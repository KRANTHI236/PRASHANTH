package com.sessoin;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;

public class Fetch_Data {

	public static List<Dto> fetch(HttpServletRequest req) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Dto d2 = new Dto();
		Query q = em.createQuery("select e from Dto e");
		List<Dto> l = q.getResultList();
		return l;
	}

}
