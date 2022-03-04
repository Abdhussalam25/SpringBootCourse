package conditions;

import java.util.Scanner;

public class InsuranceCalculator {

	public static void main(String[] args) {
	
	   int age;
       float annualCharge, discount;
	   
	   Scanner sc =  new Scanner(System.in);
	   
	   System.out.println("Enter the your age to calulate your insurance amount ");
	   
	    age = sc.nextInt();
	    if(age < 0) {
	    	 System.err.print("Sorry eligible age should not be less than 0");
	    }
	    else if((age>=0) && (age<=15)) 
		   { 
		   discount = (2500*20)/100;
		   System.out.println("discout is" + discount);
		   annualCharge = 2500 - discount;
		   System.out.println("Your Annual Insurance Amount is" + annualCharge);
		   }
	   else if((age>=16) && (age<=25)) 
	   		{
		   discount = (3500*15)/100;
		   annualCharge = 3500 - discount;
		   System.out.println("Your Annual Insurance Amout is " + annualCharge);
		   }
	   else if(age>=26 && age<=40) 
		   {
		   discount = (4000*10)/100;
		   annualCharge = 4000 - discount;
		   System.out.println("discout is" + discount);
		   System.out.println("Your Annual Insurance Amout is " + annualCharge);
		   }
	   else if(age>=41 && age<=50) 
		   {
		   annualCharge = 4500; 
		   System.out.println("Your Annual Insurance Amout is " + annualCharge);
		   }		
		   
	   else if(age>=51 && age<=70) 
		   {
			   annualCharge = 5500;
		   System.out.println("Your Annual Insurance Amout is " + annualCharge);
		   }	
	   else {
		   System.err.print("Sorry eligible age is to get insurance is between 0 to 70 only");
	   }
	   	
		
	}

}
