package account;

public class Account {
	private double balance;
	public double getBalance() {
		return this.balance;
	}
		
	public Account() {
	}

	public Account(double balance) {
		this.balance = balance;
	}


	public  void deposite(double amount) {
		balance+=amount;
		System.out.println("..deposite Operation performed successful and current balance is:"+
		this.getBalance());
	}
	
	public  void withdraw(double amount) {
		balance-=amount;
		System.out.println("..withdraw Operation performed successful and current balance is:"+
		+this.getBalance());
	}
	
	public synchronized void transfer(double amount,Account target) {
		this.withdraw(amount);
		target.deposite(amount);
		
	}

	
}
