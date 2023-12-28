package com.sessoin;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;

public class Update_Delete {

	public static void update(HttpServletRequest req) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Dto d = new Dto();
		String v = req.getParameter("option");
		int id = Integer.parseInt(req.getParameter("id"));
		String act = req.getParameter("update");
		System.out.println(act + " " + v);
		switch (act) {
//		case "id":
//			et.begin();
//			d = em.find(Dto.class, id);
//			d.setId(id);
//			em.merge(d);
//			et.commit();
//
//			break;
		case "name":
			et.begin();
			d = em.find(Dto.class, id);
			d.setName(v);
			em.merge(d);
			et.commit();

			break;
		case "phno":
			et.begin();
			d = em.find(Dto.class, id);
			d.setPhno(Long.parseLong(v));
			em.merge(d);
			et.commit();

			break;
		case "gmail":
			et.begin();
			d = em.find(Dto.class, id);
			d.setGmail(req.getParameter(v));
			em.merge(d);
			et.commit();

			break;
		case "pwd":
			et.begin();
			d = em.find(Dto.class, id);
			d.setPwd(req.getParameter(v));
			em.merge(d);
			et.commit();

		default:
			System.out.println("enter proper details");
			break;
		}
	}

//	public static void delete(HttpServletRequest req) {
//		
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("kranthi");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//		
//		Dto d1=new Dto();
//		
//		em.find(Dto.class, d1);
//		
//		et.begin();
//		em.remove(d1);
//		et.commit();
//				
//		
//	}

}
