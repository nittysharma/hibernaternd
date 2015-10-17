package com.hibernaternd;

import org.hibernate.Session;

public class TestMain {
  public static void main(String[] args) {
	 Person person = new Person();
	 person.setName("nitty");
	 Session session = HibernateUtil.getSessionFactory().openSession();
	 session.beginTransaction();
	 session.save(person);
	 session.getTransaction().commit();
	 System.out.println((Person)session.get(Person.class, 1l));
	 
	 session.close();
	 System.err.println("Done");
  }
}
