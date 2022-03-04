package com.hibernate.HibernateOneToOne2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Address;
import com.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();		

		Student student=new Student();
		student.setStudentId(100);
		student.setStudentName("Sanju");
		Address address = new Address();
		address.setCity("New Delhi");
		address.setState("Dellhi");
		address.setStudent(student);		

		    Transaction tx = session.beginTransaction();
		    session.save(address);
		    tx.commit();
		    session.close();
		    System.out.println("One to One mapping is Done and records saved successfully..!!");
		    sessionFactory.close();
    
    }
}
