package com.service;
import java.util.Iterator;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.bean.Customer;
import com.bean.Vendor;
public class App3 
{
	public static void main( String[] args )
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();	
		Vendor vendor=null;
		Transaction tx=null;
		vendor=(Vendor)session.get(Vendor.class, 122);
		//show vendor information
		System.out.print(vendor);
		tx=session.beginTransaction();
		session.delete(vendor);
		tx.commit();
		session.close();
		System.out.print("\n one to many mapping deletion completed..");
		sessionFactory.close();
	}
}
