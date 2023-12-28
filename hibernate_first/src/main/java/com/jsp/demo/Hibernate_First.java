package com.jsp.demo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Hibernate_First {
  public static void main(String[] args) {
  
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("prashi");
	  
	  
	  System.out.println(emf);
	  
}
}
