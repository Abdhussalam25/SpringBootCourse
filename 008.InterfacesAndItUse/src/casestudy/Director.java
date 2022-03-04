package casestudy;

public class Director extends Employee{

	public Director() {
		super();
	}

	public Director(String name, double basic, String contactNumber) {
		super(name, basic, contactNumber);
	}

	@Override
	double totalPay(int leave) {
		//gross_sal=basic+hra(35%)+da(20%)+ta(18%)
		//totalpay=gross_sal-deduction
		double deduct=deduction(leave);
		double hra=this.getBasic()*0.35;
		double da=this.getBasic()*0.2;
		double ta=this.getBasic()*0.18;
		double gross_sal=this.getBasic()+hra+da+ta;
		double totalpay=gross_sal-deduct;
		return totalpay;
	}

}
