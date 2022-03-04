package com.entities;

import java.util.Date;

public class Employee {
	
	private int empId;
	private String firstName;
	private	String lastName;
	private	Date birthDate;
	private String contactNumber;
	
	public Employee() {
		super();
	}
	public Employee(int empId,String firstName, String lastName, Date birthDate, String contactNumber
			) {
		
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.contactNumber = contactNumber;
		
	}
	public int getempId() {
		return empId;
	}
	public void setempId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	@Override
	public String toString() {
		return "Employee empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", birthDate=" + birthDate + ", contactNumber=" + contactNumber;
	}
	 
	
	
	
}
