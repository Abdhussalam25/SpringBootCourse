package loops;

import java.util.Scanner;

public class SmartVoterApplication {

	// Which will get name and age of person and display the following message
	// if age is 0 to 18  "Hi name You can not vote just enjoy games"
	//2. if age 18 to 120, Hi name please vote to elect honest leader
	//3. if age beyond 120 Hi name your age is not valid
	
	// continue
	// want to continue more voter eligibility
	// 1 for Yes or 0  for no
	
	public static void main(String[] args) {
		int choice;
		do {
		System.out.println(" ======Smart Voter Application====");
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your Name : ");
		String name =sc.next();
		System.out.println(" Enter your Age : ");
		int age =sc.nextInt();
		
		if(age < 0) System.err.println("\n Hi" + name + "Age should be greater than 0");
		else if(age >= 0  && age <18) System.out.println("\nHi " +name+" You can not vote just enjoy games");
		else if(age >= 18  && age <= 120) System.out.println("Hi " +name+" please vote to elect honest leader");
		else System.err.println( "Hi "+ name +"your age is not valid" );
		
		System.out.println(" \n want to continue more voter eligibility");
		System.out.println("\n 1 for Yes or 0  for No");
		
		choice = sc.nextInt();
		
		}while (choice == 1);

	}

}
