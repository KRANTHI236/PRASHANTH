package com.session;

import javax.persistence.*;
import javax.servlet.http.HttpServletRequest;

public class display {
	public static void update(HttpServletRequest req) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("magician");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Dto e = new Dto();
		String f = req.getParameter("field");
		String key = req.getParameter("update");
		int id = Integer.parseInt(req.getParameter("id"));
		switch (key) {
		case "Eid":
			et.begin();
			e = em.find(Dto.class, id);
			e.setEid(Integer.parseInt(f));
			em.merge(e);
			et.commit();
			break;
		case "Ename":
			et.begin();
			e = em.find(Dto.class, id);
			e.setEname(f);
			em.merge(e);
			et.commit();
			break;
		case "Eage":
			et.begin();
			e = em.find(Dto.class, id);
			e.setEage(Integer.parseInt(f));
			em.merge(e);
			et.commit();
			break;
		case "Esal":
			et.begin();
			e = em.find(Dto.class, id);
			e.setEsal(Integer.parseInt(f));
			em.merge(e);
			et.commit();
			break;
		case "Eno":
			et.begin();
			e = em.find(Dto.class, id);
			e.setEno(Long.parseLong(f));
			em.merge(e);
			et.commit();
			break;

		default:
			break;
		}
	}

	public static void Delete(HttpServletRequest req) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("magician");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
		et.begin();
		Dto e1 = em.find(Dto.class, id);
		System.out.println(e1);
//		System.out.println(e1.getEname());
		em.remove(e1);
		et.commit();
	}

}
