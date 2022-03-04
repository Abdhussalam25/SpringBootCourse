package multplethreadusingsharedsingleresource;

import java.util.Scanner;

public class Account {
	private double balance;

	public double getBalance() {
		return this.balance;
	}
	
	public synchronized void deposite(String msg) {
		double amount=this.getAmount();
		balance+=amount;
		System.out.print("\nCurrent Balance for "+msg+" is :"+getBalance());
	}
	
	public  synchronized void withdraw(String msg) {
		double amount=this.getAmount();
		balance-=amount;
		System.out.print("\nCurrent Balance for "+msg+" is :"+getBalance());
	}

	public  synchronized void enquiry(String msg) {
		System.out.print("\nCurrent Balance for "+msg+" is :"+getBalance());
	}
	
	public double getAmount() {
		double amount;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter Amount:");
		amount=sc.nextDouble();
		return(amount);
	}
}
