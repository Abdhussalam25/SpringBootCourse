package inheritanceorder;

public class ShippedOrder extends Order {

	
	
	private double totalPrice;
		
	public ShippedOrder() {
		super();
	}
	private double calculatePrice() {
		
			  
		totalPrice =   super.getUnitPrice() * super.getQuantity() * 4;
		
		System.out.println("the result value "+ totalPrice);
		   return totalPrice;
		   
	   }
	@Override
	public String toString() {
		return  "ShippedOrder [totalPrice=" + totalPrice + "]";
		
	}	
	
	
	public void display() {
		calculatePrice();
		System.out.println(this);
	}
	
	
	
}
