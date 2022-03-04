package comparisonwithcomparable;

public class Product implements Comparable<Product> {
	
	private int pId;
	private String pName;
	private int pQty;
	private float pPU;
	private double totalPrice;
	public Product() {
		super();
	}
	public Product(int pId, String pName, int pQty, float pPU) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pQty = pQty;
		this.pPU = pPU;
		this.totalPrice = this.pPU*this.pQty;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpQty() {
		return pQty;
	}
	public void setpQty(int pQty) {
		this.pQty = pQty;
	}
	public float getpPU() {
		return pPU;
	}
	public void setpPU(float pPU) {
		this.pPU = pPU;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	@Override
	public String toString() {
		return "\n Product pId=" + pId + ", pName=" + pName + ", pQty=" + pQty + ", pPU=" + pPU + ", totalPrice="
				+ totalPrice ;
	}
	
	public int compareTo(Product prod) {
		if(this.pId > prod.pId) return 1;
		else if(this.pId < prod.pId) return -1;
		else return 0;
		
	}
	
	
//	public int compareTo(Product prod) {
//		
//		
//	}
	
	
	
	
	

}
