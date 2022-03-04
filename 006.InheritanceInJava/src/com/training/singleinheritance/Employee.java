package com.training.singleinheritance;

public class Employee extends Person{
	private int empId;
	private String deptName;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String firstName, String lastName, String contactNumber,String deptName, double salary) {
		super(firstName,lastName,contactNumber);
		this.empId = empId;
		this.deptName = deptName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\nempId=" + empId + super.toString()+ ", deptName=" + deptName + ", salary=" + salary;
	}
}
