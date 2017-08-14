package com.gontuseries;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Client {

	public static void main(String[] args) {
		Address add = new Address();
		add.setStreet("BTM");
		Student stud = new Student();
		stud.setStudName("Susheel1");
		
		add.setStudent(stud);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(add);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
