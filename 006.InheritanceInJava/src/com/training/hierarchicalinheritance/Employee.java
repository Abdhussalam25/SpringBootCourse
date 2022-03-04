package com.training.hierarchicalinheritance;
import com.training.singleinheritance.Person;
public class Employee extends Person{
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
	public Employee(int empid,String firstName, String lastName, String contactNumber,double salary) {
		super(firstName, lastName, contactNumber);
		this.setEmpId(empid);
		this.setSalary(salary);
	}
	@Override
	public String toString() {
		return "\nempId=" + empId + ", FirstName=" + getFirstName()
				+ ", LastName" + getLastName() + ", ContactNumber" + getContactNumber()
				+", Salary" +getSalary();
	}
	
	
	
	
	

}
