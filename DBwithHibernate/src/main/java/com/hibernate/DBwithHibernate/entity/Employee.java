package com.hibernate.DBwithHibernate.entity;

public class Employee {
	private int empId;
	private String empFirstName;
	private String empLastName;
	private String empEmailId;
	private float empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpEmailId() {
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public Employee() {
	}
	public Employee(int empId, String empFirstName, String empLastName, String empEmailId, 
			float empSalary) {
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empEmailId = empEmailId;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "\nempId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empEmailId=" + empEmailId + ", empSalary=" + empSalary;
	}
}
