package inheritancevehicle;
//e number of wheels and the average number of miles per gallon.
public class Vehicle {

	private int numberOfWheels;	
	private double avgNumOfMPG;
	
	public Vehicle() {
		super();
	}

	public Vehicle(int numberOfWheels, double avgNumOfMiles) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.avgNumOfMPG = avgNumOfMiles;
		
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public double getavgNumOfMPG() {
		return avgNumOfMPG;
	}

	public void setavgNumOfMPG(double avgNumOfMiles) {
		this.avgNumOfMPG = avgNumOfMiles;
	}

	@Override
	public String toString() {
		return "Vehicle [numberOfWheels=" + numberOfWheels + ", avgNumOfMPG=" + avgNumOfMPG + "]";
	}
	
	
	
	
}
