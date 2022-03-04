package inheritance.multilevel;

import inheritance.Person;

public class Student extends Person {

	private String course;

	public Student() {
		super();
	}

	public Student(String course) {
		super();
		this.course = course;
	}

	public Student(String firstName, String lastName, long contactNumber, String course) {
		super(firstName, lastName, contactNumber);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", Person	" + super.toString() + "]";
	}
	
	
	
	
	
}
