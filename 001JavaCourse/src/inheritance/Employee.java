package inheritance;

public class Employee extends Person{
	
	
	private int empId;
	private String deptName;
	public Employee() {
		super();
	}
	public Employee(int empId, String deptName) {
		super();
		this.empId = empId;
		this.deptName = deptName;
	}
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
	@Override
	public String toString() {
		return  super.toString()  + "Employee [empId=" + empId + ", deptName=" + deptName + "]";
	}
	
	

}
