package com.hibernate.HibernateOnetoMany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Customer;
import com.bean.Vendor;

public class App 
{
    public static void main( String[] args )
    {
    	Set set=new HashSet();
    	Transaction tx=null;
    	
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();	
		Vendor vendor=new Vendor();
		vendor.setVendorId(122);
		vendor.setVendorName("Fast Food");
		
		Customer customer1=new Customer();
		customer1.setCustomerId(11);
		customer1.setCustomerName("Rabindra");
		
		Customer customer2=new Customer();
		customer2.setCustomerId(22);
		customer2.setCustomerName("Jitendra");
		
		Customer customer3=new Customer();
		customer3.setCustomerId(33);
		customer3.setCustomerName("Harsha");
		
		Customer customer4=new Customer();
		customer4.setCustomerId(44);
		customer1.setCustomerName("Vasudha");
		
		Customer customer5=new Customer();
		customer5.setCustomerId(55);
		customer5.setCustomerName("Kautav");
		
		set.add(customer1);
		set.add(customer2);
		set.add(customer3);
		set.add(customer4);
		set.add(customer5);
		vendor.setChildren(set);
		tx=session.beginTransaction();
		session.save(vendor);
		tx.commit();
		System.out.print("\n one to many mapping completed..");
		session.close();
		sessionFactory.close();
		
    }
}
