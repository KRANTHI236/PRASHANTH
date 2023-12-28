package controller;

import dao.PersonDao;
import dto.Person;

public class deleteBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PersonDao personDao=new PersonDao();
personDao.deleteBoth(2);
	}

}
