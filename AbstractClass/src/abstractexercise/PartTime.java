package abstractexercise;

public class PartTime extends Student {
	
	int creditHour;

	public PartTime(String name, boolean fullTimeStatus, int creditHour) {
		super(name, fullTimeStatus);
		// TODO Auto-generated constructor stub
		this.creditHour = creditHour;
	}

	
	@Override
	public void determineTution() {
		
		super.setFee(200 * creditHour);
	}

	
	



	@Override
	public String toString() {
		return "PartTime Student creditHour=" + creditHour + ", Details" + super.toString() + "]";
	}


	public void display() {
		
		
		System.out.println(this);
	}

}
