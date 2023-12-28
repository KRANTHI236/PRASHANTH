package com.hibernate;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Dao_Dept {

	public static void deptData(javax.servlet.http.HttpServletRequest rq) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Dto_Dept d = new Dto_Dept();

		d.setDid(Integer.parseInt(rq.getParameter("did")));
		d.setDname(rq.getParameter("dname"));
		d.setLoc(rq.getParameter("loc"));

		et.begin();
		em.persist(d);
		et.commit();

	}

	public static Dto_Dept fetch(int n) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Dto_Dept d=em.find(Dto_Dept.class, n);
		et.commit();
		return d;
	}
	

}
