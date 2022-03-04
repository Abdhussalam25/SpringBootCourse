package allaboutstring.trainee;

import java.util.Scanner;

public class TraineeService {

	public static void main(String[] args) {
		
		String members[];
		
		int actualMembers = 0;
		
		Integer num = new Integer(actualMembers);
		actualMembers= num.intValue();
		
		Integer num2 = actualMembers;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the maximum number of trainees could be in the batch: ");
		
		final int N = sc.nextInt();
		
		members =  new String[N];
		
		System.out.println("Enter the names of the trainees");
		
		for(int i = 0;i<N; i++) {
			members[i] = sc.next();
			actualMembers++;
		}
		
       for(int i=0; i<actualMembers; i++) {
    	   
    	   System.out.println(members[i]);
			
		}
		

	}
	
	

}
