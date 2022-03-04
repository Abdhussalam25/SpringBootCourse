package inheritancecollegecourse;

import java.util.Scanner;

public class UseCourse {

	public static void main(String[] args) {
	
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" =========College Course ==================");
		System.out.println("Enter your Dept BIO, CHM, CIS, or PHY or any other");
		
		String department  =  sc.next();
		System.out.println("Enter your course Number");
		
		int courseNumber  =  sc.nextInt();
		
          System.out.println("Enter your credit hour");
		
	    int credit  =  sc.nextInt();
		
		if( department == "BIO" || department == "CHM" || 
				department == "CIS" ||department == "PHY") {
			LabCourse course = new LabCourse(department,courseNumber,credit);
			course.display();
		}else {
			
			CollegeCourse  course = new CollegeCourse(department,courseNumber,credit);
			course.display();
		}
		
		
		
		

	}

}
