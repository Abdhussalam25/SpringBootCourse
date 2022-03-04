package casestudy;

public class Manager extends Employee{
	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Manager() {
		super();
	}

	public Manager(String name, double basic, String contactNumber,String deptName) {
		super(name, basic, contactNumber);
		this.setDeptName(deptName);
	}

	public void showData(){
		System.out.print("\n Name:"+this.getName()+", Basic Salary:"+this.getBasic()
		+", Contact Number:"+this.getContactNumber()+", Dept Name:"+this.getDeptName());
	}

	@Override
	double totalPay(int leave) {
		//gross_sal=basic+hra(30%)+da(15%)+ta(10%)
				//totalpay=gross_sal-deduction
				double deduct=deduction(leave);
				double hra=this.getBasic()*0.3;
				double da=this.getBasic()*0.15;
				double ta=this.getBasic()*0.1;
				double gross_sal=this.getBasic()+hra+da+ta;
				double totalpay=gross_sal-deduct;
				return totalpay;
	}
	

}
