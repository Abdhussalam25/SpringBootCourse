package allaboutclass.staticclass.innerclasses;

public class OuterClass {

	
	private int num;

	
	public OuterClass() {
		super();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	class InnerClass{
		
		//InnerClass(){};
		
		void sayGreetings() {
			System.out.print("\n num = " + num);
			
				}
		
		void userInnerClass() {
			InnerClass ic =  new InnerClass();
			ic.sayGreetings();
		}
	}
}
