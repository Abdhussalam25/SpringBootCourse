package inheritancehotel;

public class Suite extends HotelRoom {

	private int surCharge = 400;
	private int roomNumber;
	
	public Suite() {
		super();
		
	}
	public Suite(int roomNumber) {


		this.roomNumber = roomNumber;
		
	}
	
	
	
}
