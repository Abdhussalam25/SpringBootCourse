package multplethreadusingsharedsingleresource;

public class KaustavRunnable implements Runnable {
	Account account;

	public KaustavRunnable(Account account) {
		this.account=account;
	}

	@Override
	public void run() {
		account.deposite("KaustavAccont");
		
	}
}
