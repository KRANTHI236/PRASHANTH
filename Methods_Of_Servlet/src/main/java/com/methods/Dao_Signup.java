package com.methods;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;


public class Dao_Signup {

	public static void forSignup(HttpServletRequest req) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Dto_Signup d1 = new Dto_Signup();

		d1.setId(Integer.parseInt(req.getParameter("id")));
		d1.setName(req.getParameter("name"));
		d1.setPhno(Long.parseLong(req.getParameter("phno")));
		d1.setPwd(req.getParameter("ped"));

		et.begin();
		em.persist(d1);
		et.commit();

	}

}
