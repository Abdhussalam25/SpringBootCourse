package abstractexercise;

public class FullTime extends Student {

	
	
	

	public FullTime(String name, boolean fullTimeStatus) {
		super(name, fullTimeStatus);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void determineTution() {
	
		super.setFee(2000);
		
	}

	@Override
	public String toString() {
		return "FullTime Student" + super.toString() + "]";
	}
	
	public void display() {
		System.out.println(this);
	}

}
