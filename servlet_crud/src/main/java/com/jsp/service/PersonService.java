package com.jsp.service;

import java.util.List;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

public class PersonService {

	PersonDao dao = new PersonDao();

	public Person savePerson(Person p) {
		return dao.SavePerson(p);

	}

	public Person updatePerson(Person person) {
		return dao.UpdatePerson(person);

	}

	public int deletePerson(int id) {
		return dao.deletePerson(id);

	}

	public List<Person> getAllPerson() {
		return dao.getAllPerson();
	}

	public Person getPersonById(int id) {
		return dao.getPersonById(id);
	}

}
