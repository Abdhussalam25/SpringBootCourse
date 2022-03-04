package com.hibernate.test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.CreditCard;
import com.entity.DebitCard;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Scanner sc = new Scanner(System.in);
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        
        CreditCard ccard = new CreditCard();
        ccard.setCreditCardType("Coral");       
        ccard.setAmount(34500);
        
        DebitCard dcard = new DebitCard();
        dcard.setDebitCardType("Visa");
        dcard.setAmount(22900);
        
        Transaction tx =  session.beginTransaction();
        session.save(ccard);
        session.save(dcard);
        tx.commit();       
        System.out.println("Payments saved successfully...");
        
        
        //session.flush();
        session.close();
        sf.close();       
        
    	
    	
    }
}
