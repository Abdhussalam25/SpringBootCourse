package com.training;

import java.util.ArrayList;
import java.util.ArrayList;

public class Bank {

	public ArrayList<Account> accounts = new ArrayList<>();
	
	
	

	
	public Bank(ArrayList<Account> accounts) {
		super();
		this.accounts = accounts;
	}
	public Bank() {
		
	}
	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	

	public ArrayList<Account> addNewAccount(Account account){
	
		if(account.getBalance() == 0)
	 		System.out.println("Account not created initial deposit amount is min 5000");
		else {
			accounts.add(account);	
			System.out.println("Account added successfully");
		}
		return accounts;		
	}
	
	public Account depositAmount(String accountName, int accountId, int amount) {
		Account temp = null;
		
		for(Account acc: accounts) {
			if(acc.getAccountName().equals(accountName) && acc.getAccountId() == accountId) {
				acc.depositAmount(amount);
				temp = acc;
				break;
			}
			
		}		
	return temp;		
	  	
	}
	//BAnk withdrawal
	public Account withdrawAmount(String accountName, int accountId, int amount) {
		Account temp = null;
		
		for(Account acc: accounts) {
			if(acc.getAccountName().equals(accountName) && acc.getAccountId() == accountId) {
				acc.withDrawAmount(amount);
				temp = acc;
				break;
			}
			
		}		
	return temp;		
	  	
	}
	//  app transaction
	public void transferBetweenAccounts(Account acc1, Account acc2, int amount) {
		
		if(acc1.withDrawAmount(amount)) {
			acc2.depositAmount(amount);
			System.out.println("transfer between accounts successful");
			
		}
		else
			System.out.println("Sorry Transaction failed");	
		
	}
	
	public ArrayList<Account> retreiveAll(){
		
		return accounts;
	}
	
	public Account searchByAccount(Account acc) {
		Account temp = null;
		for(Account acct: accounts) {
			if(acct.getAccountName() == acc.getAccountName() && acct.getAccountId() == acc.getAccountId())
				temp = acct;
			
		}
		return temp;
		
	}
	
	public Account modAccount(Account acc, String name) {
		Account temp = null;
		for(Account acct: accounts) {
			if(acct.getAccountName() == acc.getAccountName() && acct.getAccountId() == acc.getAccountId())
				{
				acct.setAccountName(name);				
				temp = acct;
			     break;
				}
		}
		return temp;
		
	}
	
   public ArrayList<Account> delAccount(Account acc){
	   for(Account acct: accounts) {
			if(acct.getAccountName() == acc.getAccountName() && acct.getAccountId() == acc.getAccountId())
				{
				accounts.remove(acct);
			     break;
				}
		}
	   
	   
	   return accounts;
	   
	   
   }
@Override
public String toString() {
	return "Bank [accounts=" + accounts + "]";
}
	

	
	
	
	
}
