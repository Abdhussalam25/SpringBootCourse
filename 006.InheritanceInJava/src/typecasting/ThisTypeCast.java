package typecasting;
class A{
	 int i=22;
	}

	class B extends A{
	int i=50;
	}
	
	class C extends B{
	int i=40;
	public void show() {
		System.out.println(this.i);
		System.out.println(((B)this).i);
		System.out.println(((A)this).i);
	}
	}
public class ThisTypeCast {	
	public static void main(String[] args) {
		C obj=new C();
		obj.show();
	}
}
