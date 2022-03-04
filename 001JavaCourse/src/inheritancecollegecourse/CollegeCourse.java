package inheritancecollegecourse;

import java.util.Scanner;

public class CollegeCourse {

	String department;
	int courseNumber;
	int credit;
	float courseFee;
	public CollegeCourse() {
		super();
	}
	public CollegeCourse(String department, int courseNumber, int credit) {
		super();
		this.department = department;
		this.courseNumber = courseNumber;
		this.credit = credit;
	}
	
	private float calculateFee() {
		//int hour;
//		Scanner sc  = new Scanner(System.in);
//		System.out.println("Enter the no of hour for course : ");
		//hour =  sc.nextInt();
		courseFee = credit * 120;
		
		return courseFee;
		
	}
	
	@Override
	public String toString() {
		return "CollegeCourse [department=" + department + ", courseNumber=" + courseNumber + ", credit=" + credit
				+ ", courseFee=" + courseFee + "]";
	}	

	public void display() {
		
		calculateFee();
		System.out.println(this);
		
	}
	
	
}
