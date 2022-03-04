package inheritancehotel;

public class HotelRoomService {

	public static void main(String[] args) {
		
		HotelRoom room = new HotelRoom(500);
		HotelRoom room2 = new HotelRoom(250);
		HotelRoom room3 = new HotelRoom(300);
		HotelRoom room4 = new HotelRoom(200);
		
		room.getNightlyRentCharge();
		

	}

}
