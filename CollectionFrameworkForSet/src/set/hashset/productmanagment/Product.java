package set.hashset.productmanagment;

public class Product {

	private int pid;
	private String pName;
	private int pQty;
	private float pPu;
	
	public Product() {
		super();
	}

	public Product(int pid, String pName, int pQty, float pPu) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.pQty = pQty;
		this.pPu = pPu;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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

	public float getpPu() {
		return pPu;
	}

	public void setpPu(float pPu) {
		this.pPu = pPu;
	}

	
	
	public double calculatePrice() {
		return this.pPu* this.pQty;
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", pQty=" + pQty + ", pPu=" + pPu +"Total Price "+ calculatePrice() +"]";
	}
	
	
}
