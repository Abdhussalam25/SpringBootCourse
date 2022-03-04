package com.bean;

import java.util.Set;

public class Student {
	private int studentId;
	private String studentName;
	private float marks;
	private Set courses;
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
		return courses;
	}
	public void setCourses(Set courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "\nstudentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks;
	}
	
}
