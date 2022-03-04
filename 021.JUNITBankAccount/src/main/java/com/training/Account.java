package com.training;

public class Account {

	
	private String AccountName;
    private int AccountId;
 
    private int balance;
    
    private final int minBalance = 5000;    
    

	public Account() {
		super();
	} 
	
	
	
	public Account(String accountName, int accountId) {
		super();
		AccountName = accountName;
		AccountId = accountId;
	}

	public Account(String accountName, int accountId, int depositAmount) {
		super();
		if(depositAmount >= minBalance) {
		AccountName = accountName;
		AccountId = accountId;
		this.balance = depositAmount;
		
		}else {
			System.err.println("Initial amount has to be greater or equal to minimum balance 5000");
		}
				
	}
	
	

	public int getAccountId() {
		return AccountId;
	}

	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	
	public int getBalance() {
		return balance;
	}

	

	public int depositAmount(int amount) {
		if(amount >= 1000) 
		this.balance += amount;		
		else System.err.println("Amount has to be minimum 1000 not less than 1000");
		
		return balance;
	}
	
	public boolean withDrawAmount(int amount) {
		boolean status = false;
		if(balance > minBalance) {
			if(amount >= 1000) {
				int temp = balance;
				    temp -= amount;
				    
				if(temp >= minBalance) {
					balance -= amount;
					System.out.println("Amount detected and transaction successfull");
					status = true;
				}
				else 
				System.out.println("We could not withdraw this much "+ amount+ "as your balance is moving below min balance");
					
				
				
				
			}else {
				System.out.println("withdrawal amount has to be atleast 1000");
			}
			
			
		}else {
			
			System.err.println("Sorry you canot withdraw money as you have only minimum balance in your account");
		}
			
	
		return status;
		
	}



	@Override
	public String toString() {
		return "Account [AccountName=" + AccountName + ", AccountId=" + AccountId + ", balance=" + balance + "]";
	}

	
     
    
}
