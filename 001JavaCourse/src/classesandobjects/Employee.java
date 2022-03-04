package classesandobjects;


//hra  40% of basic salary
//da float 20% of basic salary
//ta float 10% of basic salary
//Gross salary float basicSalary + hra + da + ta
//tax float 20 % of gross salary
//Pf float 10% of gross salary
//netSalary float gross salary – (tax + pf)

public class Employee {

	
	private int empCode;
	private String empName;
	private float basicSalary;
    private double hra;
    private double da;
    private double ta;
    private double grossSalary;
    private double tax;
    private double pf;
    private double netSalary;
    
	public Employee() {
		super();
	}

	public Employee(int empCode, String empName, float basicSalary) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.basicSalary = basicSalary;
	}

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	
	
	
	public void input(int ecode, String name, float salary) {
		
		this.empCode = ecode;
		this.empName = name;
		this.basicSalary = salary;
		
	     calculate();
				
		
	}
	
	private void calculate() {
		hra = 0.4 * basicSalary;
		da = 0.2 * basicSalary;
		ta = 0.1 * basicSalary;
		grossSalary = basicSalary + hra + da + ta;
		tax = 0.2 * grossSalary;
		pf = 0.1 * grossSalary;
		netSalary = grossSalary - (tax + pf);
		
		
	} 
	
    
    
	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", empName=" + empName + ", basicSalary=" + basicSalary + ", hra=" + hra
				+ ", da=" + da + ", ta=" + ta + ", grossSalary=" + grossSalary + ", tax=" + tax + ", pf=" + pf
				+ ", netSalary=" + netSalary + "]";
	}
	
	
	public void display() {
		
		System.out.println(this);
	}
    
	
}
