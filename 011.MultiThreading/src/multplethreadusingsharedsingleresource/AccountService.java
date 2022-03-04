package multplethreadusingsharedsingleresource;

public class AccountService {

	public static void main(String[] args) {
		Account account=new Account();
		Thread jitendraAccount=new Thread(new JitendraRunnable(account));
		Thread manishAccount=new Thread(new ManishRunnable(account));
		Thread kaustavAccount=new Thread(new KaustavRunnable(account));
		
		jitendraAccount.start();
		manishAccount.start();
		kaustavAccount.start();
		

	}

}
