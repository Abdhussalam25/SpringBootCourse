package comparisonwithcomparator;

public class Student  {

	private int rollNumber;
	private String firstName;
	private float marks;
	public Student() {
		
	}
	public Student(int rollNumber, String firstName, float marks) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.marks = marks;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student  \n rollNumber=" + rollNumber + ", firstName=" + firstName + ", marks=" + marks + "]";
	}
	
	
	
	
	
}
