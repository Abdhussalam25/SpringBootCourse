package casestudy;

public abstract class Employee {
	private String name;
	private double basic;
	private String contactNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Employee() {
		super();
	}
	public Employee(String name, double basic, String contactNumber) {
		super();
		this.name = name;
		this.basic = basic;
		this.contactNumber = contactNumber;
	}
	public void showData(){
		System.out.print("\n Name:"+this.getName()+", Basic Salary:"+this.getBasic()
		+", Contact Number:"+this.getContactNumber());
	}
	public double deduction(int leave){ 
		double temp=(this.getBasic()/30)*leave;
		return temp;
	}
	
	//abstract method
	abstract double totalPay(int leave);

}
