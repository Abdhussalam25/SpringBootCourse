package methodoverriding;

public class Employee extends Student{
	private int empId;
	private double salary;
	public void showData() {
		super.showData();
		System.out.print("\n Employee Id:"+this.empId+", Employee Salary:"+this.salary);
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String firstName, String lastName, String contactNumber, String course,
			int empId,double salary) {
		super(firstName, lastName, contactNumber, course);
		this.empId=empId;
		this.salary=salary;
	}
	

}
