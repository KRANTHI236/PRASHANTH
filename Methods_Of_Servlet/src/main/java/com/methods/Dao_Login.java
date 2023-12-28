package com.methods;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;


public class Dao_Login {

	public static Dto_Login forLogin(HttpServletRequest req) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		Long phno = Long.parseLong(req.getParameter("phno"));
		Dto_Login d = em.find(Dto_Login.class, phno);

		return d;

	}

}
