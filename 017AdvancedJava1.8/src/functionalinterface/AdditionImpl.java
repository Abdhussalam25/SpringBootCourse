package functionalinterface;

public class AdditionImpl  {

	public static void main(String[] args) {
	Addition addition =  (n1,n2)->{return n1+n2;};

	int res =  addition.add(12, 13);
	System.out.println("Additon is +" + res);
	
	
	}
	
}
