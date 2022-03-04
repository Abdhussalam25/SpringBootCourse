package com.hibernate.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;
import com.entities.EmployeeAddress;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=null;
        try {
        	tx=session.beginTransaction();
        	Employee employee=new Employee(123,"Sarthak","Kumar",new Date(24022022),"8587001003");
        	EmployeeAddress employeeAddress=new EmployeeAddress("311","Delhi","India","110043");
        	employeeAddress.setEmployee(employee);
        	session.persist(employeeAddress);
        	tx.commit();
        	System.out.print("\n data inserted successfully...");
        }catch(Exception e) {
        	System.err.print("\n"+e.getMessage());

    }
}
}
