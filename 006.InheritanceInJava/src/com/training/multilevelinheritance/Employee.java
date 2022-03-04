package com.training.multilevelinheritance;

public class Employee extends Student{
	private int empId;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public Employee(String firstName, String lastName, String contactNumber, String course,
			int empId,double salary) {
		super(firstName, lastName, contactNumber, course);
		this.setEmpId(empId);
		this.setSalary(salary);	
	}
	@Override
	public String toString() {
		return "\nempId=" + empId + super.toString()+", salary=" + salary;
	}

}
