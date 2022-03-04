package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private int empId;
	  
	  private String empFName;
	  private String empLastName;
	  private String address;
	  private String department;
	  private float basicSalary;
	  private String userName;
	  private String password;


	private double grossSalary;


	public Employee() {
		super();
	}


	public Employee(String empFName, String empLastName, String address, String department,
			float basicSalary) {
		super();
		this.empId = empId;
		this.empFName = empFName;
		this.empLastName = empLastName;
		this.address = address;
		this.department = department;
		this.basicSalary = basicSalary;
		this.grossSalary = calculateGross(basicSalary);
		this.password = empFName.substring(0, 3) + empLastName.substring(0, 3);
		this.userName = empFName + empLastName;
		 
				
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	private double calculateGross(float salary) {
		double grossSalary = 0.00;
		
		
//		hra(30% of basic), ta(10% for basic, 
//				pf(20% of basic) , da(15% of basic), gross salary(basic + hra + da + ta) , 
//				deduction(pf only)
		double hra = 0.3*salary;
		double ta = 0.1*salary;
		double da = 0.15*salary;
		double pf = 0.2*salary;
		grossSalary = (salary+hra+ta+da) - pf;		
		return grossSalary;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpFName() {
		return empFName;
	}


	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}


	public String getEmpLastName() {
		return empLastName;
	}


	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public float getBasicSalary() {
		return basicSalary;
	}


	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}


	public double getGrossSalary() {
		return grossSalary;
	}


	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFName=" + empFName + ", empLastName=" + empLastName + ", address="
				+ address + ", department=" + department + ", basicSalary=" + basicSalary + ", grossSalary="
				+ grossSalary + "]";
	}
	
	

	
	
}
