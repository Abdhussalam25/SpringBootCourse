package inheritancevehicle;

public class Car extends Vehicle {
	
	
	
	  public Car(int avgNumOfMPG) {
		  
		  if(avgNumOfMPG > 0 && avgNumOfMPG <= 35) {
			  super.setNumberOfWheels(4);
			  super.setavgNumOfMPG(avgNumOfMPG);
		  }
		  
	  }
	

}
