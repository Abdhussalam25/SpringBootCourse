package com.application.sms.dto;

import java.util.Arrays;

public class Student {

	
	private int rollNumber;
	private String firstName;
	private String stream;
	private float marks[]; //for java,hibernate and spring
	private float avg; //and grade(A-D)
	public Student() {
		
	}
	public Student(int rollNumber, String firstName, String stream, float[] marks) {
		
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.stream = stream;
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
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public float[] getMarks() {
		return marks;
	}
	public void setMarks(float[] marks) {
		this.marks = marks;
	}
	public float getAvg() {
		return avg;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", firstName=" + firstName + ", stream=" + stream + ", marks="
				+ Arrays.toString(marks) + ", avg=" + avg + "]";
	}
	
	
	
	
}
