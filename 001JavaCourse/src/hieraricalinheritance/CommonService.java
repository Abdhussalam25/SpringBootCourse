package hieraricalinheritance;

public class CommonService {

	public static void main(String[] args) {
		
		Player pobj = new Player("salam" ,"allabahas", 475123,"boxing");
		
		//pobj.setGame("Boxing");
		
		System.out.println(pobj);
		
		Employee eobj = new Employee("salam ", "allabahas", 49796464,478,250000);
		System.out.println(eobj);
		
	}

}
