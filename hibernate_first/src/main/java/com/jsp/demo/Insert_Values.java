package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert_Values {
  public static void main(String[] args) {
	  
	  User u1=new User();
	  
	  u1.setId(20);
	  u1.setName("gopi");
	  u1.setAge(21);
	  u1.setId(50);
	  u1.setName("jai");
	  u1.setAge(21);
	
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("prashi");
	  
	  EntityManager em=emf.createEntityManager();
	  
	  EntityTransaction et=em.getTransaction();
	  
	  et.begin();
	  
	  em.persist(u1);
	  
	  et.commit();
}
}
