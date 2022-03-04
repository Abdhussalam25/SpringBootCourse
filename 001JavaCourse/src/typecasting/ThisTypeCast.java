package typecasting;

class A  {
	int i = 22;

	}

	class B extends A{

	int i = 50;
	}

	class C extends B{
	int i = 40;
	
	public void show() {
		System.out.println(i);
		System.out.println(super.i);
	}
	}

public class ThisTypeCast {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.i);
		  //  but how to print A vaue
		
		B cofb = new C();
		System.out.println(cofb.i);
		}
	

	
	
	

}
