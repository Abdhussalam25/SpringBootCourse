package methodoverriding;

public class Service {

	public static void main(String[] args) {
		Person pobj=new Person("Rabindra","Kumar","8587001003");
		pobj.showData();
		
		
		Student sobj=new Student("Lalitha","Singh","9818254421","FSD");
		sobj.showData();;
		
		Employee emp=new Employee("Jitendra","Pandey", "9910587200", "System Admin",
				234,45600);
		emp.showData();

	}

}
