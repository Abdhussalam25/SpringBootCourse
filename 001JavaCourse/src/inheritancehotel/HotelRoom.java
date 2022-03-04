package inheritancehotel;

public class HotelRoom {

	private int roomNumber;
	protected double nightlyRentCharge ;
	public HotelRoom() {
		super();
	}
	public HotelRoom(int roomNumber) {
		super();
		
		this.roomNumber = roomNumber;
		
		if(roomNumber <= 299) nightlyRentCharge  = 6900;
		else nightlyRentCharge = 8900;
	}
	public double getNightlyRentCharge() {
		return nightlyRentCharge;
	}
	public void setNightlyRentCharge(double nightlyRentCharge) {
		this.nightlyRentCharge = nightlyRentCharge;
	}
	
	
	
	
	
}
