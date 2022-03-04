package com.hibernate.HibernateOnetoMany;
import java.util.Iterator;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.bean.Customer;
import com.bean.Vendor;
public class App2 
{
	public static void main( String[] args )
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();	
		Vendor vendor=null;

		vendor=(Vendor)session.get(Vendor.class, 122);
		//show vendor information
		System.out.print(vendor);
		//Show customers
		Set set=vendor.getChildren();
		Iterator <Customer>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
		System.out.print("\n one to many mapping completed..");
		session.close();
		sessionFactory.close();
	}
}
