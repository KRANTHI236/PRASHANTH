package controller;

import dao.PersonDao;

public class FetchByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PersonDao personDao=new PersonDao();
personDao.fetchByName("kiran");
	}

}
