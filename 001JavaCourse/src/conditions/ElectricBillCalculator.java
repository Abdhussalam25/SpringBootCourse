package conditions;

import java.util.Scanner;

public class ElectricBillCalculator {

	public static void main(String[] args) {
		
		
		int ebUnitsConsumed;
		double totalCharge;
		int rent  = 150;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of EB units Consumed: " );
		
		ebUnitsConsumed = sc.nextInt();
		
		totalCharge = chargeCalculater(ebUnitsConsumed,rent);
		
		
		System.out.println("Your EB bill is: " + totalCharge );
		

	}
	
	public static double chargeCalculater(int units, int rent) {
		
		if(units>=0 && units <= 200) 
		return rent;
		else if(units>=201 && units<=400)
			return ((units-200) * 4.50) + rent;
		else if(units>=401 && units<=700)
			return ((units-200) * 7.0) + rent;
		else if(units>=701 && units<=1000)
			return ((units-200) * 11.25) + rent;
		else if(units>=1001 && units<=1500)
			return ((units-200) * 16.70) + rent;
		else if(units>1500)
			return ((units-200) * 21) + rent;
		else {
			System.err.print(" Cosumed units has to be a postive number");
			
			System.exit(0);
			return rent;
		}
		
/*Test cases 1:
 * Enter -ve value expected else part has to be executed
 * Test Case 2  150
 * expected result : 150
 * 
 * Test Case 3: 300
 * expected result : 600
 * 
 * * Test Case 4: 501
 * expected result : 2257.0
 * 
 * * Test Case 5: 1001
 * expected result : 13526.6999
 * 
 * * Test Case 6: 1500
 * expected result : 21860
 * 
 * * Test Case 7: 1600
 * expected result : 29950.0
 * 
 * 
  * 
 * */
		
		
		
		
	}

}
