package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Aadharcard;
import dto.Person;

public class PersonDao {

	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("magician");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public void insertBoth(Person person)
	{
		Aadharcard aadharcard=person.getAadharcard();
		entityTransaction.begin();
		entityManager.persist(aadharcard);
		entityManager.persist(person);
		entityTransaction.commit();
	}
	public void fetchById(int id)
	{
		Person dbperson=entityManager.find(Person.class, id);
		System.out.println(dbperson);
	}
	public void fetchAll()
	{
		Query query=entityManager.createQuery("select p from Person p");
		List<Person> list=query.getResultList();
		System.out.println(list);
	}
	public void deletePerson(int id)
	{
		Person dbperson=entityManager.find(Person.class,id);
		if(dbperson!=null)
		{
			entityTransaction.begin();
			entityManager.remove(dbperson);
			entityTransaction.commit();
		}
	}
	public void deleteAadharcard(int id)
	{
		Aadharcard dbaadharcard=entityManager.find(Aadharcard.class, id);
		if(dbaadharcard!=null)
		{
			entityTransaction.begin();
			entityManager.remove(dbaadharcard);
			entityTransaction.commit();
		}
	}
	public void deleteBoth(int id)
	{
		Person dbperson=entityManager.find(Person.class, id);
		if(dbperson!=null)
		{
			entityTransaction.begin();
			entityManager.remove(dbperson);
			
			entityTransaction.commit();
		}
		
	}
	public void updateBoth(int id, Person person)
	{
		Person dbPerson=entityManager.find(Person.class, id);
		Aadharcard aadharcard=person.getAadharcard();
		if(dbPerson!=null)
		{
			person.setPersonId(id);
			aadharcard.setAadharcardId(id);
			entityTransaction.begin();
			entityManager.merge(aadharcard);
			entityManager.merge(person);
entityTransaction.commit();
			
		}
	}
}
