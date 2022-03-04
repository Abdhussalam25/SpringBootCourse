package inheritancevehicle;

public class MotorCycle extends Vehicle {

	
	public MotorCycle(int avgNumOfMPG) {
		  
		  if(avgNumOfMPG > 35 && avgNumOfMPG <= 80) {
			  super.setNumberOfWheels(2);
			  super.setavgNumOfMPG(avgNumOfMPG);
		  }
		  
	  }
}
