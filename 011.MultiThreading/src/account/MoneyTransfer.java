package account;

public class MoneyTransfer implements Runnable{
	private Account from;
	private Account to;
	private double amount;
	
	public MoneyTransfer() {
	}
	public MoneyTransfer(Account from, Account to, double amount) {
		this.from = from;
		this.to = to;
		this.amount = amount;
	}
	
	public void run() {
		from.transfer(amount, to);
	}
	
}
