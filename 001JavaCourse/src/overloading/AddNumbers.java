package overloading;

public class AddNumbers {

//	 public int addNumbers(int num1, int num2) {
//		 
//		 return num1 + num2;
//	 }
//
// public int addNumbers(int num1, int num2,int num3) {
//		 
//		 return num1 + num2+num3;
//	 }
 
 //For varyiing no of parameters we can not go for contious creating method

	 ///VAR ARG
 
 public int AddNumbers(int ...num) {   //Method overloading + VAR Args
	 int total = 0;
	 for(int n:num) {
		 
		 return total  = total + n;
	 }
	 return total;
 }
	 
}
