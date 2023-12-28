package com.hibernate;

import javax.persistence.*;

public class Dao_Emp {

	public static void insertEmpData(javax.servlet.http.HttpServletRequest rq) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		int n = Integer.parseInt(rq.getParameter("dept"));
		Dto_Dept d = Dao_Dept.fetch(n);
		Dto_Emp e1 = new Dto_Emp();
		e1.setEid(Integer.parseInt(rq.getParameter("id")));
		e1.setEname(rq.getParameter("name"));
		e1.setEmpnum(Long.parseLong(rq.getParameter("empnum")));
		e1.setD(d);
		d.getD1().add(e1);
		et.begin();
		em.persist(e1);
		em.merge(d);
		et.commit();

	}

}
