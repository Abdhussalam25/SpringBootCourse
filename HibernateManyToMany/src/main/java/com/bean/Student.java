package com.bean;

import java.util.Set;

public class Student {
	
	private int studentId;
	private String studentName;
	private float marks;
	private Set Courses;
	
	
	public Student() {
		super();
	}


	public Student(int studentId, String studentName, float marks, Set courses) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		Courses = courses;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public float getMarks() {
		return marks;
	}


	public void setMarks(float marks) {
		this.marks = marks;
	}


	public Set getCourses() {
		return Courses;
	}


	public void setCourses(Set courses) {
		Courses = courses;
	}


	@Override
	public String toString() {
		return "Student studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks;
	}
	
	
	
	
	

}
