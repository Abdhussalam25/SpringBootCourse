package inheritanceyear;

public class LeapYear2 extends Year {
	
	public LeapYear2() {
		super(366);
	}
	
public int daysElapsed(int month, int day ) {
    	
    	int noOfDaysElapsed = 0;
    	int monthDays = 0;
    	int priviousMonth = month -1;
    	
    	switch(priviousMonth) {
    	case 0:
    		monthDays = 0;
    		break;
    	case 1:
    		monthDays = 31;
    		break;
    	case 2:
    		monthDays = 31+29;
    		break;
    	case 3:
    		monthDays = 31+29+31;
    		break;
    	case 4:
    		monthDays = 31+29+31+30;
    		break;
    	case 5:
    		monthDays = 31+29+31+30+31;
    		break;
    	case 6:
    		monthDays = 31+29+31+30+31+30;
    		break;
    	case 7:
    		monthDays = 31+29+31+30+31+30+31;
    		break;
    	case 8:
    		monthDays = 31+29+31+30+31+30+31+31;
    		break;
    	case 9:
    		monthDays = 31+29+31+30+31+30+31+31+30;
    		break;
    	case 10:
    		monthDays = 31+29+31+30+31+30+31+31+30+31;
    		break;
    	case 11:
    		monthDays = 31+29+31+30+31+30+31+31+30+31+30;
    		break;
         	} 	
    	
    	
    	
    	noOfDaysElapsed = monthDays + (day - 1);     
    	return noOfDaysElapsed;
    }

	
	
	
}
