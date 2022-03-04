package com.training.multilevelinheritance;
import com.training.singleinheritance.Person;
public class Student extends Person{
	String course;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student() {
		super();
	}

	public Student(String firstName, String lastName, String contactNumber,String course) {
		super(firstName, lastName, contactNumber);
		this.setCourse(course);
	}

	@Override
	public String toString() {
		return super.toString()+", course=" + course;
	}

}
