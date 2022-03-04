package classesandobjects;

import java.util.Arrays;

public class StudentAssignment {

	private int rollNo;
	private String name;
	private int marks[];
	private float total;
	private float average;
	private String grade;
	public StudentAssignment() {
		super();
	}
	public StudentAssignment(int rollNo, String name, int[] marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public void input(int rollNo, String name, int[] marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		
		calculateGrade(marks);
		
		
	}
	
	
	
	
	private void calculateGrade(int[] marks2) {
		//this.total =
		int totalMarks = 0;
		for(int mark: marks2) {
			
			totalMarks += mark;
		}
		this.total = totalMarks;
		
		this.average = total/5;
		
		String tempGrade = "";
		
		if(average >= 75) tempGrade = "A";
		else if(average >= 60 && average <= 74) tempGrade = "B";
		else if(average >= 40 && average <= 59) tempGrade = "C";
		else tempGrade = "Fail";
		
		this.grade = tempGrade;
//		
//		>=75 A
//				60-74 B
//				40-59 C
//				<40 fail
		
	}
	@Override
	public String toString() {
		return "StudentAssignment [rollNo=" + rollNo + ", name=" + name + ", marks=" + Arrays.toString(marks)
				+ ", total=" + total + ", average=" + average + ", grade=" + grade + "]";
	}
	
	
	public void display() {
		
		System.out.println(this);
		
	}
	
	
}
