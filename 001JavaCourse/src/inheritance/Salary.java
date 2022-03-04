package inheritance;

public class Salary extends Employee {
	
	private float basicSalary;
    private double hra;
    private double da;
    private double ta;
    private double grossSalary;
    private double esi;
    private double pf;
    private double deduct;
    private double netSalary;
    
    public Salary() {
		super();
	}

	public Salary(float basicSalary) {
		super();
		
		this.basicSalary = basicSalary;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	 
	
	
	private void calculate() {
		hra = 0.3 * basicSalary;
		da = 0.15 * basicSalary;
		ta = 0.1 * basicSalary;
		
		
		
		netSalary = grossSalary - deduct;
		
		
	} 
	
	public double findGross() {
		
		calculate();
	    this.grossSalary = basicSalary + hra + da + ta;
		return grossSalary;	
		
	}
	
	public double findDeduct() {
		
		esi = 0.02 * grossSalary;
		pf = 0.3 * grossSalary;
	    deduct = esi + pf;
		return deduct;
		
	}
	
	public double netSalary() {
		
		netSalary =  findGross() - findDeduct();
		
		return netSalary;
	}
	
	
	
	

	@Override
	public String toString() {
		return  super.toString()+  "Salary [basicSalary=" + basicSalary + ", hra=" + hra + ", da=" + da + ", ta=" + ta + ", grossSalary="
				+ grossSalary + ", esi=" + esi + ", pf=" + pf + ", deduct=" + deduct + ", netSalary=" + netSalary + "]";
	}
	
	public void display() {
		netSalary();
		System.out.println(this);
	}
	
	
	
	
	
	
	
	

}
