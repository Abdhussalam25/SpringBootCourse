package inheritanceorder;

public class UserOrder {

	public static void main(String[] args) {
		
		Order ordObj = new Order();
		
//		ordObj.setCustomerName();
//		ordObj.setCustomerNumber();
//		ordObj.setProductName();
//		ordObj.setQuantity();
//		ordObj.setUnitPrice();
//		ordObj.display();
//		
		
		ShippedOrder shiObj = new ShippedOrder();
		
		shiObj.setCustomerName();
		shiObj.setCustomerNumber();
		shiObj.setProductName();
		shiObj.setQuantity();
		shiObj.setUnitPrice();
		shiObj.display();
		shiObj.getTotalPrice();
		
		
		
		
	}

}
