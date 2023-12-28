package controller;

import dao.PersonDao;
import dto.Pancard;
import dto.Person;

public class updateBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		 person.setPersonName("dhoni");
		 person.setPersonAge(21);
		 
		 Pancard pancard=new Pancard();
		 pancard.setPancardNumber("khr4257hj");
		 pancard.setPancardAuthority("GOK");
		 
		 pancard.setPerson(person);
		 person.setPancard(pancard);
		 
		 
		 PersonDao personDao=new PersonDao();
		 personDao.updateBoth(1, person);
			}
	}


