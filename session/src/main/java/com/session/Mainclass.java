package com.session;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;

public class Mainclass {
	public static void insert(HttpServletRequest req) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("magician");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Dto d1 = new Dto();
		d1.setEid(Integer.parseInt(req.getParameter("eid")));
		d1.setEname(req.getParameter("ename"));
		d1.setEage(Integer.parseInt(req.getParameter("eage")));
		d1.setEsal(Integer.parseInt(req.getParameter("esal")));
		d1.setEno(Long.parseLong(req.getParameter("eno")));
		et.begin();
		em.persist(d1);

		et.commit();
	}
}
