package threadaccounts;

import java.util.Scanner;

//This will act as DTO -- Data TRansfer Object
public class Account {
	private double balance;
	Scanner sc =  new Scanner(System.in);

	public double getBalance() {
	
		return balance;
	}
	
	public double getAmount() {
		double amount;
		System.out.println("Enter the amount " );
		amount = sc.nextDouble();
		return amount;
	}
	

//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
	public synchronized void deposit() {
		double amount = this.getAmount();
		balance += amount;
		
	}
	public void enquiry() {
		System.out.println("Current balance is " + getBalance());
	}

	public void withdraw() {
		double amount = this.getAmount();
		this.balance -= amount;
	}

	public void deposit(int i) {
		// TODO Auto-generated method stub
		
	}
	


}
