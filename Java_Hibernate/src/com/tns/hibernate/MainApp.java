package com.tns.hibernate;

import org.hibernate.Session;

public class MainApp {

	public static void main(String[] args) {
		Session objsession = HlbernateDBConnect.getSessionFactory().openSession();

		// CRUD operation
		// Step 1: Create
		Users user1 = new Users(1,"asiya", "siya@32", "asiya", "banu");
		objsession.beginTransaction();
		objsession.save(user1);
		objsession.getTransaction().commit();

		/*
		 * // Step 2:Retrieval
		 * 
		 * Users user2 = new Users(); objsession.beginTransaction(); user2 =
		 * objsession.get(Users.class, 1);
		 * 
		 * objsession.getTransaction().commit(); System.out.println(user2);
		 * 
		 * // Step 3: Update users
		 * 
		 * Users user3 = new Users(); objsession.beginTransaction(); user3 =
		 * objsession.get(Users.class, 3); user3.setPassword("Innu123");
		 * 
		 * objsession.getTransaction().commit(); System.out.println(user3);
		 * 
		 * // Step 4: Deletion Users user4 = new Users(); objsession.beginTransaction();
		 * user4 = objsession.get(Users.class, 4); objsession.delete(user4);
		 * objsession.getTransaction().commit();
		 */
	}

}