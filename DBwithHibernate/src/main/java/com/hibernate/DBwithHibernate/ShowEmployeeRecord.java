package com.hibernate.DBwithHibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import com.hibernate.DBwithHibernate.entity.*;

public class ShowEmployeeRecord {
	public static void main(String[] args) {
		int id=222;
		Employee emp=null;
		try {
		Session session=new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory()
				.openSession();
		//emp=(Employee) session.load(Employee.class, 222);
		emp=(Employee) session.get(Employee.class, id);
		if(emp==null) {
			System.err.print("\nNo record found for id:"+id);
		}else {
		System.out.print(emp);
		}
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\nApplication ended");
	}

}
