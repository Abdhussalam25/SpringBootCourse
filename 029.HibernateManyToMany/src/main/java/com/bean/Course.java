package com.bean;

import java.util.Set;

public class Course {
	private int courseId;
	private String courseName;
	private int duration;
	private Set Students;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Set getStudents() {
		return Students;
	}
	public void setStudents(Set students) {
		Students = students;
	}
	@Override
	public String toString() {
		return "\ncourseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration;
	}
	
	

}
