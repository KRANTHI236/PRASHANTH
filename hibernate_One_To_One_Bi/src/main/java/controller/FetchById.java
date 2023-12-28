package controller;

import dao.PersonDao;

public class FetchById {
public static void main(String[] args) {
	PersonDao personDao=new PersonDao();
	personDao.fetchById(1);
}
}
