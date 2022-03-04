package hieraricalinheritance;

import inheritance.Person;

public class Employee extends Person {

	private int empId;
	
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, long contactNumber,int empId, double salary) {
		super(firstName, lastName, contactNumber);
		// TODO Auto-generated constructor stub
		this.empId = empId;
		this.salary = salary;
	}

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

	@Override
	public String toString() {
		return "Employee Id " + getEmpId() + ", salary=" + salary +" " + super.toString() + "]";
	}

//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", salary=" + salary +" " + super.toString() + "]";
//	}

	
	
	
	
}
