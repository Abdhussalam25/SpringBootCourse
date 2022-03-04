package methodoverloading;

public class AdditionService {

	public static void main(String[] args) {
//		Addition obj=new Addition();
//		System.out.println(obj.add(12.0f, 245.0f));
//		System.out.println(obj.add());
//		obj.add();
//		System.out.println(obj.add("Jitendra","Pandey"));
		AddNumbers sum=new AddNumbers();
		double s=sum.add(12,13);
		System.out.println(s);
		
		s=sum.add(12.0f,13.0f,15.0f);
		System.out.println(s);
		
		s=sum.add(12l,13l,15l,10l,10l,10l);
		System.out.println(s);
		s=sum.add(12,13,15,10,10,10,12,13l,15,10.0,10.0f,10.0f);
		System.out.println(s);
	}
}
