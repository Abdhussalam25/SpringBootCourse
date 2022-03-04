package inheritanceyear;


public class Year {
	
	private int noOfDaysInYear;

	public Year() {
		
		this.noOfDaysInYear = 365;
	}

	
	
	public Year(int noOfDaysInYear) {
		
		this.noOfDaysInYear = noOfDaysInYear;
	}


//Include a getter method that displays the number of days.
	public void getNoOfDaysInYear(String yearname) {
		System.out.println( " No of days in " + yearname + " is " + noOfDaysInYear);
	}

	public void setNoOfDaysInYear(int noOfDaysInYear) {
		this.noOfDaysInYear = noOfDaysInYear;
	}
	
	
	
	
	

}
