package predefined;

public class ExceptionDemo {
	int div(int iNumber1,int iNumber2) {
		int temp=0;
		try {
			temp=iNumber1/iNumber2;
			System.out.print("\nOperation successful..");
		}catch(Exception e) {
			System.err.print("\n"+e.getMessage());
			System.err.print("\nTo avoid exception, second number should not be zero..");
		}
		return temp;

	}

	public static void main(String[] args) {
		ExceptionDemo ed=new ExceptionDemo();
		int temp=ed.div(12,2);
		if(temp>0)
		System.out.print("\n Ans:"+temp);
	}

}
