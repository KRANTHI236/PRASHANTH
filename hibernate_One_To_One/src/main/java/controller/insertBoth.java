package controller;

import dao.PersonDao;
import dto.Aadharcard;
import dto.Person;

public class insertBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Aadharcard aadharcard=new Aadharcard();
aadharcard.setAadharcardNumber(2345990677l);
aadharcard.setAadharcardAuthority("GOI");



Person person=new Person();
person.setPersonName("kiran");
person.setPersonAddress("tamilnadu");
person.setPersonAge(32);


person.setAadharcard(aadharcard);
PersonDao personDao=new PersonDao();
personDao.insertBoth(person);
	}

}
