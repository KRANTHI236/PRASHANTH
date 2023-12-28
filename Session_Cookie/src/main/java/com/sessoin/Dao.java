package com.sessoin;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;

public class Dao {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");

	static EntityManager em = emf.createEntityManager();

	static EntityTransaction et = em.getTransaction();

	public static void insertData(HttpServletRequest req) {
		Dto d1 = new Dto();
		d1.setId(Integer.parseInt(req.getParameter("id")));
		d1.setName(req.getParameter("name"));
		d1.setPhno(Long.parseLong(req.getParameter("num")));
		d1.setGmail(req.getParameter("mail"));
		d1.setPwd(req.getParameter("pwd"));

		et.begin();
		em.persist(d1);
		et.commit();

	}
}
