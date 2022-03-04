package oopconcepts;

public class Product {
	
	/*
	 * prodId,prodName,prodQty,prodPrice
	 * create a constructor to initialize variables
	 * create method to calculate totol price 
	 * 
	 * 
	 * */
	
	
	private int prodId;
	private String prodName;
	private int prodQty;
	private float prodPrice;
	public Product() {
		super();
	}
	public Product(int prodId, String prodName, int prodQty, float prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodQty = prodQty;
		this.prodPrice = prodPrice;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdQty() {
		return prodQty;
	}
	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	public float getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(float prodPrice) {
		this.prodPrice = prodPrice;
	}
	
	
		
	
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodQty=" + prodQty + ", prodPrice="
				+ prodPrice + "]";
	}
	
	private double findTotalPrice() {
		
		return prodPrice*prodQty;
	}
	
	public void showData() {
		
		System.out.println(this);
		System.out.println("Total price is "+ findTotalPrice());
	}
	
	

}
