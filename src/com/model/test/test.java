package com.model.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.entity.Student;

public class test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cf.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Student stu = new Student(1,"vaishvik","vaisvhvik@gmail.com","Rohru");
		Student stu1 = new Student(2,"karan","Karan@gmail.com","shimla");
		Student stu2 = new Student(3,"Hritvik","Hritvik@gmail.com","chandighrah");
		Student stu3 = new Student(4,"Paras","Paras@gmail.com","Rohru");
		
		session.save(stu);
		
		session.save(stu1);
		
		session.save(stu2);
		
		session.save(stu3);
		tx.commit();
//		
		
		
		
	}
}
