package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Pancard;
import dto.Person;

public class PersonDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("magician");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public void insertBoth(Person person)
	{
//		Pancard pancard=person.getPancard();
		entityTransaction.begin();
		entityManager.persist(person);
//		entityManager.persist(pancard);
		entityTransaction.commit();
	}
	public void fetchById(int id)
	{
		Person dbperson=entityManager.find(Person.class, id);
		System.out.println(dbperson);
		
		}
	public void fetchAll()
	{
		Query query=entityManager.createQuery("select p from Person  p");
		List<Person>list=query.getResultList();
		System.out.println(list);
	}
	public void fetchByName(String name)
	{
		Query query=entityManager.createQuery("select p from Person p where p.personName=?1");
		query.setParameter(1, name);
         List<Person>list=query.getResultList();
         System.out.println(list);
		
	}
	public void deleteBoth(int id)
	{
		Person dbPerson=entityManager.find(Person.class, id);
		if(dbPerson!=null)
		{
			entityTransaction.begin();
			entityManager.remove(dbPerson);
			entityTransaction.commit();
		}
	}
	public void updateBoth(int id,Person person)
	{
		Person dbperson=entityManager.find(Person.class, id);
		if(dbperson!=null)
		{
			person.setPersonId(id);
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
			
		}
	}
	
}
