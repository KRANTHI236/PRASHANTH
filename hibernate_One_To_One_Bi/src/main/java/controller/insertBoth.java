package controller;

import dao.PersonDao;
import dto.Pancard;
import dto.Person;

public class insertBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Person person=new Person();
 person.setPersonName("kiran");
 person.setPersonAge(21);
 
 Pancard pancard=new Pancard();
 pancard.setPancardNumber("hae34257hj");
 pancard.setPancardAuthority("GOI");
 
 pancard.setPerson(person);
 person.setPancard(pancard);
 
 
 PersonDao personDao=new PersonDao();
 personDao.insertBoth(person);
	}

}
