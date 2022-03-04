package abstractexercise;

import java.util.Scanner;

public class UseStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Student name");
		
		String name = sc.next();
		
		System.out.println("Enter the Student tution status as true or false");
		
		
		
		boolean status = sc.nextBoolean();
		
		if(status) {	
		
		
		FullTime student1 = new FullTime(name, status);
		
		student1.determineTution();
		
		student1.display();
		}else {
			
			System.out.println("Enter the credithour");
			int creditHour = sc.nextInt();
		
        PartTime student2 = new PartTime(name, status, creditHour);
			student2.determineTution();
	
		student2.display();
		}
		
	

	}
	
//	public static void main(String args) {   ///  though this also main actullay this is method overloading 
//		//JVM first will find the above method not this one as first
//		
//		System.out.println("Another duplicate mehtod overloading main");
//		
//		
//	}
	

}
