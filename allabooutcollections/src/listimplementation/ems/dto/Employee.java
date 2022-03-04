package listimplementation.ems.dto;

public class Employee {
	
	private int empId;
	private String firstName;
	private String lastName;
	private String deptName;
	private float salary;
	public Employee() {
		
	}
	public Employee(int empId, String firstName, String lastName, String deptName, float salary) {
		
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptName = deptName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
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
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\n empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", deptName="
				+ deptName + ", salary=" + salary ;
		
	}
	
	

	
}
