package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Getting_Values {
  public static void main(String[] args) {
	
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("prashi");
	  
	  EntityManager em=emf.createEntityManager();
	  
	  User user = em.find(User.class, 30);
	  
	  if(user != null) {
		  System.out.println("get id:"+user.getId());
		  System.out.println("get name:"+user.getName());
		  System.out.println("get age:"+user.getAge());
		  
	  }
	  else {
		  System.out.println("check the data");
	  }
}
  
}
