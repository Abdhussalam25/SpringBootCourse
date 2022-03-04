package inheritanceorder;

import java.util.Scanner;

public class Order {

	/*
	 * 
	 * : Create a class named “Order” that performs order processing of a single item. It has following fields:
customer name, customer number, quantity ordered, unit price.
Include setter and getter methods for each field.
The setter methods prompt the user for values for each field. 
Create a method(calculatePrice() ) to calculate the
total price (quantity x unit price) and 
another method to display total price calculated.
Create a subclass named “ShippedOrder” that overrides calculatePrice () by adding a shipping and handling
charge of Rs 4.00 per item.
Write an application named “UseOrder” that instantiates an object of each of classe and display the results
separately.

	 */
	
	
	private String customerName;
	private long customerNumber;
	private String productName;
	private int quantity;
	private double unitPrice;
	private double totalPrice;
	public Order() {
		super();
	}
	Scanner sc =  new Scanner(System.in);
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName() {
		System.out.println("Enter the Customer Name ");
		String customerName = sc.next();		
		this.customerName = customerName;
	}
	public long getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber() {
		System.out.println("Enter the Customer Number ");
		long customerNumber = sc.nextLong();
		this.customerNumber = customerNumber;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName() {
		System.out.println("Enter the productName ");
		String productName = sc.next();
		
		this.productName = productName;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity() {
		System.out.println("Enter the Quantity ");
		int quantity = sc.nextInt();
		this.quantity = quantity;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice() {
		System.out.println("Enter the unitPrice ");
		double unitPrice = sc.nextDouble();
		this.unitPrice = unitPrice;
	}
	
	
	
	
   private double calculatePrice() {
	 
	   totalPrice =  quantity * unitPrice;
	   
	   return totalPrice;
	   
   }  
   
   
public double getTotalPrice() {
	return totalPrice;
}


@Override
public String toString() {
	return "Order [customerName=" + customerName + ", customerNumber=" + customerNumber + ", productName=" + productName
			+ ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
}
public void display() {
	   calculatePrice();
	   System.out.println("Total Price :" + this.totalPrice);
	   
	   
   }
	
	
	
	
	
}
