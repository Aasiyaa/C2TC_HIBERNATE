package com.tns.hibernate;
import org.hibernate.Session;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	private static Session session;
	public static void main(String[] args) {
		Session session=HlbernateDBConnect.getSessionFactory().openSession();
		try {
	session.beginTransaction();
	session.createQuery("delete users where fname='john'").executeUpdate();
}finally {
	session.close();
}	
	}
}
