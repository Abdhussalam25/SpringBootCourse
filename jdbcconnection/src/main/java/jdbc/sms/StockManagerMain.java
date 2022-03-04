package jdbc.sms;

import java.util.Scanner;

public class StockManagerMain {

	public static void main(String[] args) {
	
		StockManagerImpl stockmanager = new StockManagerImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Option. Option has to be between 0 to 5");
//		1. Add Stock
//		2. Mod Stock
//		3. Del Stock
//		4. Show Stocks
//		5. Show Stock By Id
//		0. Terminate the app
//		Enter your choice(0-5):
		
		int option = sc.nextInt();	
		
		do {
			System.out.println("1. Add Stock");
			System.out.println("2. Modify Stock");
			System.out.println("3. Delete Stock");
			System.out.println("4. Show Stocks");
			System.out.println("5. Show Stock By Id");
			System.out.println("0. Exit application");
			
			
			
			
			switch(option) {
			case 1:
				stockmanager.addStockRecord(new Stock(01,"mouse",150.0f,6));
				break;
			case 2:
				stockmanager.modStockRecord(new Stock(01,"mouse",155.0f,9));
				break;
			case 3:
				stockmanager.delStockRecord(01);	
				break;
			case 4:
				stockmanager.showAllStockRecords();
				break;
			case 5:
				stockmanager.showStockRecordById(01);
				break;
			case 0:
				System.exit(0);
			default:{
				System.out.println("Please enter proper input 0 to 5 only");
			}
			}	
		}while(option != 0);

}
}
