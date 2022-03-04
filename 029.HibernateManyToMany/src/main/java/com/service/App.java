package com.service;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Course;
import com.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Transaction tx=null;
    	
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();	
		Student student1=new Student();
		student1.setStudentId(100);
		student1.setStudentName("Kapil");
		student1.setMarks(78.50f);
		
		Student student2=new Student();
		student2.setStudentId(200);
		student2.setStudentName("Shiva");
		student2.setMarks(87.50f);
		
		Course course1=new Course();
		course1.setCourseId(1001);
		course1.setCourseName("RDBMS");
		course1.setDuration(10);
		
		Course course2=new Course();
		course2.setCourseId(1002);
		course2.setCourseName("Hibernate");
		course2.setDuration(12);
		
		Set set=new HashSet();
		set.add(course1);
		set.add(course2);
		
		student1.setCourses(set);
		student2.setCourses(set);
		tx=session.beginTransaction();
		session.save(student1);
		session.save(student2);
		tx.commit();
		session.close();
		System.out.print("\nmany to many mapping done.....");
		sessionFactory.close();
    }
}
