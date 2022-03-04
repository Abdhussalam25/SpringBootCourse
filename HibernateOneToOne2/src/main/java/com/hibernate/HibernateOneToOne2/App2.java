package com.hibernate.HibernateOneToOne2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Address;
import com.bean.Student;

public class App2 {

	public static void main(String[] args) {
		Student student=null;
		Address address = null;
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();		

		address=(Address)session.get(Address.class, new Integer(100));
		System.out.print("\n addressId:"+address.getAddressId()+"  city:"+address.getCity());

		student=address.getStudent();
		System.out.print("\n empId:"+student.getStudentId()+"  studnet Name:"+student.getStudentName());
		
		session.close();
		sessionFactory.close();
	}

}
