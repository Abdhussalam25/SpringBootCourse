package inheritanceyear;

public class UseYear2 {

	public static void main(String[] args) {
	
		Year2 yearObj2 = new Year2();
		yearObj2.getNoOfDaysInYear("Normal Year");
		
		LeapYear2 leapObj2 = new LeapYear2();		
		
		System.out.println("days elapsed " + leapObj2.daysElapsed(3, 3));
		
		System.out.println( "days elapsed " +    yearObj2.daysElapsed(3, 3));
		

	}

}
