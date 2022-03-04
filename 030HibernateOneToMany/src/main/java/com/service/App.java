package com.service;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Customer;
import com.bean.Vendor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Transaction tx=null;
    	
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();	
		Vendor vendor=new Vendor();
		
		vendor.setVendorId(1010);
		vendor.setVendorName("Tutormines");
		
		Customer customer1 = new Customer();
		customer1.setCustomerId(1);
		customer1.setCustomerName("Intellect Design");
		
		Customer customer2 = new Customer();
		customer2.setCustomerId(2);
		customer2.setCustomerName("CTS");
		
		Customer customer3 = new Customer();
		customer3.setCustomerId(3);
		customer3.setCustomerName("ThinkWrite");
		
		Set set =  new HashSet();
		
		set.add(customer1);
		set.add(customer2);
		set.add(customer3);
		
		vendor.setChildren(set);
		
		tx = session.beginTransaction();
		session.save(vendor);
		tx.commit();
		System.out.println("\n data saved successfully");
		
    }
}
