package multplethreadusingsharedsingleresource;

public class JitendraRunnable implements Runnable{
	Account account;

	public JitendraRunnable(Account account) {
		this.account=account;
	}

	@Override
	public void run() {
		account.enquiry("JitendraAccount");
	}

}


