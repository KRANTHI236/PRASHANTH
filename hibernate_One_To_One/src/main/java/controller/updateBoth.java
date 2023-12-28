package controller;

import dao.PersonDao;
import dto.Aadharcard;
import dto.Person;

public class updateBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aadharcard aadharcard=new Aadharcard();
		aadharcard.setAadharcardNumber(9765832158l);
		aadharcard.setAadharcardAuthority("GOT");



		Person person=new Person();
		person.setPersonName("ram");
		person.setPersonAddress("Hyd");
		person.setPersonAge(27);
		


		person.setAadharcard(aadharcard);
		PersonDao personDao=new PersonDao();
		personDao.updateBoth(3, person);
	}

}
