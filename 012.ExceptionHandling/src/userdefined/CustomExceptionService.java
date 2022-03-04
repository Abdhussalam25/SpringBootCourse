package userdefined;
import java.util.Scanner;
public class CustomExceptionService {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.print("\nEnter first number:");
		num1=sc.nextInt();
		
		System.out.print("\nEnter second number:");
		num2=sc.nextInt();
		try {
		if(num1>num2) {
			throw new CustomeException(num1+" is greater than "+num2);
		}else if(num2>num1) {
			throw new CustomeException(num2+" is greater than "+num1);
		}else {
			throw new CustomeException(num1+" and "+num2+" both are same");
		}
		}catch(CustomeException e) {
			System.err.println(e.getMessage());
		}

	}

}
