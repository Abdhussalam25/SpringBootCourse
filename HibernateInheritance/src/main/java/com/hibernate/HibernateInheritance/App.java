package com.hibernate.HibernateInheritance;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.ContractualEmployee;
import com.entity.Employee;
import com.entity.RegularEmployee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session session = null;
        Transaction tx = null;
        
   try {
            session = new Configuration()
            		.configure("hibernate.cfg.xml")
            		.buildSessionFactory()
            		.openSession();
                 
                 tx = session.beginTransaction();
                 
                 Employee emp = new Employee();
                 emp.setEmpFirstName("Sarthak");
                 emp.setEmpLastName("naresh");
                 emp.setEmpEmailId("sarthak@gmail.com");
                 
                 RegularEmployee regemp =  new RegularEmployee();
                 regemp.setEmpFirstName("vidya");
                 regemp.setEmpLastName("singh");
                 regemp.setEmpEmailId("vidya@gmail.com");
                 regemp.setEmpSalary(56700);
                 regemp.setBonus(12000);
                 
                 ContractualEmployee conemp =  new ContractualEmployee();
                 conemp.setEmpFirstName("roja");
                 conemp.setEmpLastName("raja");
                 conemp.setEmpEmailId("rojaraja@gmail.com");
                 conemp.setPayPerHour(1500);
                 conemp.setProjDuration("FEb-22 - Mar22");;
                 
                 session.persist(emp);
                 session.persist(regemp);
                 session.persist(conemp);
                 
                 tx.commit();
                 
                 System.out.println("Succesful");
                
        	
        }catch(HibernateException he){
        	
        	he.printStackTrace();
        }
        
    	
    	
    }
}
