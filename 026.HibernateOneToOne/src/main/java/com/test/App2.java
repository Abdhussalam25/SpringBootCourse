package com.test;

import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;
import com.bean.EmployeeAddress;

public class App2 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        EmployeeAddress employeeAddress=null;
        Employee employee=null;
      
        employeeAddress=session.get(EmployeeAddress.class, 123);
        employee=employeeAddress.getEmployee();
       
        System.out.print(employeeAddress);
        System.out.print(employee);
       
    }
}
