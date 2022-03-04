package predefined.nestedtry;

public class NestedTryBlock {
	public void showArrayElement(int numArray[],int i,int j) {
		try {
			try {
				try {
					
					System.out.print(numArray[i]/numArray[j]);
				}catch(ArrayIndexOutOfBoundsException e) {
					e.printStackTrace();
				}
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
