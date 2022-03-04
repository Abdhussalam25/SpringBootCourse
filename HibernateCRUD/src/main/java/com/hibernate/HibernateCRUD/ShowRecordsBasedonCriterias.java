package com.hibernate.HibernateCRUD;

import java.util.Iterator;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

import com.hibernate.HibernateCRUD.entity.*;

public class ShowRecordsBasedonCriterias {
	public static Session getSession() {
		Session session=new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory()
				.openSession();
		return session;
	}
	public static void main(String[] args) {
		Session session=getSession(); 
		Criteria result=null;
		result=session.createCriteria(Employee.class);
		//show all records having >=111 and <=333 empId
		//result.add(Restrictions.between("empId", 111, 333));
		
		//show all records whose shalary between 40000 to 79000
		//result.add(Restrictions.between("empSalary", 40000f, 79000f));
		
		//show first record out the given below criteria
//		result.add(Restrictions.between("empSalary", 40000f, 79000f));
//		result.setMaxResults(1);
		
		//show all records except empId=111
		//result.add(Expression.not(Expression.eq("empId", 111)));
		
		//show all records whose salary >56000
		//result.add(Expression.gt("empSalary", 56000f));
		
		//show all records whose salary <56000
		result.add(Expression.lt("empSalary", 56000f));
		
		Iterator <Employee>itr=result.list().iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}

	}

}
