package inheritanceyear;

public class UseYear {

	public static void main(String[] args) {
	
		Year yearObj = new Year();
		yearObj.getNoOfDaysInYear("Normal Year");
		
		LeapYear leapObj = new LeapYear();
		leapObj.getNoOfDaysInYear("Leap ");
		

	}

}
