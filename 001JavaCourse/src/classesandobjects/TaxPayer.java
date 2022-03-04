package classesandobjects;

public class TaxPayer {

	private int panNumber;
	private String name;
	private float income;
	private double tax;
	public TaxPayer() {
		super();
	}
	public TaxPayer(int panNumber, String name, float income) {
		super();
		this.panNumber = panNumber;
		this.name = name;
		this.income = income;	
		
	}
	public int getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(int panNumber) {
		this.panNumber = panNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getIncome() {
		return income;
	}
	public void setIncome(float income) {
		this.income = income;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	
	public void input(int panNumber, String name, float income) {
		
		this.panNumber = panNumber;
		this.name = name;
		this.income = income;
		
		taxCaculate(income);
		
		
	}	
	
	private void taxCaculate(float income) {
		
		if(income <= 100000) this.tax = 0;
		else if(income >= 100001 && income <= 200000) tax =0.1 * income;
		else if(income >= 200001 && income <= 500000) tax =0.15 * income;
		else if(income > 500000) tax =0.2* income;
	}
	@Override
	public String toString() {
		return "TaxPayer [panNumber=" + panNumber + ", name=" + name + ", income=" + income + ", tax=" + tax + "]";
	}
	public void display() {
		
		System.out.println(this);
		
	}
	
	
}
