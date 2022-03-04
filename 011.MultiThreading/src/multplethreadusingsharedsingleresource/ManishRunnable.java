package multplethreadusingsharedsingleresource;

public class ManishRunnable implements Runnable {
	Account account;

	public ManishRunnable(Account account) {
		this.account=account;
	}

	@Override
	public void run() {
		account.withdraw("ManishAccount");
		
	}
}
