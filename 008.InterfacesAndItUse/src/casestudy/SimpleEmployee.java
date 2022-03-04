package casestudy;

public class SimpleEmployee extends Employee{
	

	public SimpleEmployee() {
		super();
	}

	public SimpleEmployee(String name, double basic, String contactNumber) {
		super(name, basic, contactNumber);
	}

	@Override
	public double totalPay(int leave) {
		//gross_sal=basic+hra(25%)+da(10%)+ta(5%)
		//totalpay=gross_sal-deduction
		double deduct=deduction(leave);
		double hra=this.getBasic()*0.25;
		double da=this.getBasic()*0.1;
		double ta=this.getBasic()*0.05;
		double gross_sal=this.getBasic()+hra+da+ta;
		double totalpay=gross_sal-deduct;
		return totalpay;
	}

}
