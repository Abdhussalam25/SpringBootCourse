package predefined.multiplecatchwithsingletry;
public class FactorialFinder {
	public static long factorial(final int n) {
		long fact=1;
		if(n<0) {
			throw new IllegalArgumentException("Number must be non negative..");
		}else if(n>100) {
			throw new IllegalArgumentException("Number must be more than 100..");
		}
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return(fact);
	}

	public static void main(String args[]) {
		int numbers[]= {15,8,-6,0,123};
		long res=0;
		try {
			res=factorial(15/0);
		}catch(ArithmeticException ae) {
			System.err.print("\n second number should not be zero..");
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.err.print("\n you are trying a number which is not exist in array..");
		}catch(Exception e) {
			System.err.print("\n"+e.getMessage());
		}finally {
			System.out.print("\n operation called..");
		}
		
		System.out.print("\nResult is:"+res);
	}
}



/*
 int factorial[]={3,5,0,-12,100,"23";
case 1. >=0 and within the limit==>find out factorial
case 2





*/