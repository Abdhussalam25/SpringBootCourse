package casestudy;
public class Service {
	public static void main(String[] args) {
		Employee emp=new SimpleEmployee("Lalitha", 45900,"9818254421");
		emp.showData();
		System.out.println("Total payment:"+emp.totalPay(0));
		Manager mgr=new Manager("Lalitha", 45900,"9818254421","HR");
		mgr.showData();
		System.out.println("Total payment:"+mgr.totalPay(0));
		
		Director dir=new Director("Lalitha", 45900,"9818254421");
		dir.showData();
		System.out.println("Total payment:"+dir.totalPay(0));
	}
}
