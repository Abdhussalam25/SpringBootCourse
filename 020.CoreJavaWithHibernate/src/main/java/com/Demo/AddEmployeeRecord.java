package com.Demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class AddEmployeeRecord 
{
    public static void main( String[] args )
    {
    	Employee emp=null;
		emp=new Employee();
		emp.setEmpId(111);
		emp.setEmpFirstName("Jitendra");
		emp.setEmpLastName("Pandey");
		emp.setEmpEmailId("jitpandey@gmail.com");
		emp.setEmpSalary(78900);
		Transaction tx=null;
		//try {
			Session session=new Configuration()
					.configure("hibernate.cfg.xml")
					.buildSessionFactory()
					.openSession();
			tx=session.beginTransaction();
			session.save(emp);
			tx.commit();
			System.out.print("\n Employee record added successfully..");
//		}catch(Exception e) {
//			System.err.print("\n"+e.getMessage());
//		}
    }
}
