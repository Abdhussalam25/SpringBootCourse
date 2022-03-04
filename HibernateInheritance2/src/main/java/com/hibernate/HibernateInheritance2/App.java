package com.hibernate.HibernateInheritance2;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.CreditCard;



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
                  
                 // tx = session.beginTransaction();
                  
                  CreditCard crd = new CreditCard();
                  crd.setAmount(45900);
                  crd.setCreditCardType("visa");
                
                  
                  
                  
                  tx.commit();
                  
                  System.out.println("Succesful");
                 
         	
         }catch(HibernateException he){
         	
         	he.printStackTrace();
         }
         
    	
    	
    }
}
