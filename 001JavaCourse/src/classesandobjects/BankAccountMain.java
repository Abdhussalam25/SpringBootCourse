package classesandobjects;

import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Account Id");
		
		double accountId = sc.nextDouble();
		
		System.out.println("Enter the name");
		
		String name = sc.next();
		
		System.out.println("Enter the balance");
		
		double balance = sc.nextDouble();
		
		BankAccount bc = new BankAccount();
		
		

	}

}
