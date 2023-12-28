package controller;

import dao.PersonDao;

public class deletePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PersonDao personDao=new PersonDao();
personDao.deletePerson(1);
	}

}
