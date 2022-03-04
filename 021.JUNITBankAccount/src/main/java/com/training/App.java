package com.training;

import java.util.ArrayList;
import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
    	Bank bank;
    	Account account1;
    	Account account2;
    	Account account3;
    	Account account4;
    	Account account5;
    	ArrayList<Account> accounts = new ArrayList<>();
    	
    	
		account1 = new Account("salam", 12345, 6000);
		account2 = new Account("basha", 54321, 12000);
		account3 = new Account("sanjay", 78965, 5000);
		account4 = new Account("kapil", 12345, 8000);
		account5 = new Account("kumar", 78541, 7000);
	accounts.add(account1);
	accounts.add(account2);
	accounts.add(account3);	
	System.out.println(accounts.size());		
		
	bank = new Bank(accounts);		
	System.out.println(bank.getAccounts().size());
	bank.addNewAccount(account4);
	bank.addNewAccount(account5);		
		
	System.out.println(bank.getAccounts().size());
	
	account1 = bank.depositAmount("salam", 12345, 1000);
	System.out.println(account1.getBalance());
	
	account2 = bank.withdrawAmount("basha", 54321, 1000);
	System.out.println(account2.getBalance());
	
	bank.transferBetweenAccounts(account4, account5, 2000);
	
	System.out.println(account4.getBalance());
	
	System.out.println(bank.retreiveAll());
	
	Account account = bank.searchByAccount(account5);
	
	System.out.println("Account found is "+account);
	
	bank.modAccount(account5, "kumaresh");
	
	System.out.println(account5);
	
	bank.delAccount(account5);
	
	System.out.println("reamining accounts are " + accounts);
	
	
	
	
	
	
		
				
	
			
			
			
		//System.out.println(accounts.size());
    	
    }
}
