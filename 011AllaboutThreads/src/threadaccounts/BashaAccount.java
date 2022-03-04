package threadaccounts;

public class BashaAccount implements Runnable {
   Account account;
   
   public BashaAccount(Account baacc) {
	   account = baacc;
   }
   
	@Override
	public void run() {
	   account.deposit();
	   account.enquiry();
	   account.withdraw();
	   account.deposit(1000);
		
	}

}
