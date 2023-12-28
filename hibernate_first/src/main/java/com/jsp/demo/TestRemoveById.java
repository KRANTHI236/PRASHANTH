package com.jsp.demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestRemoveById {
	
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prashi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		System.out.println("enter the id");
		int n=scan.nextInt();
		User u= em.find(User.class, n);
	    
		et.begin();
		em.remove(u);
		et.commit();
	}
}
