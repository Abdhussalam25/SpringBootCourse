package account;

public class MoneyTransferService {

	public static void main(String[] args) {
		Account lalithaAccount=new Account(10000);
		Account vasudhaAccount=new Account(10000);
		Runnable transaction1=new MoneyTransfer(lalithaAccount, vasudhaAccount, 5000);
		Thread t1=new Thread(transaction1);
	
		Runnable transaction2=new MoneyTransfer(vasudhaAccount,lalithaAccount, 2000);
		Thread t2=new Thread(transaction2);
		t1.start();
		t2.start();
		
		
	}

}
