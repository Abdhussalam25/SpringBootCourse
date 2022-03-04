package finalvariablemethodandclass;

public class FinalAsVariable {

	 final int j = 11;
	 int k = 12;
	public static void main(String[] args) {
		
		final int i = 10;
		System.out.println(i);
	//	System.out.println(j); //  not possible to call here
		
		//System.out.println(k); object varibles cannot be handled by static methods as main also a static method so only

	}

}
