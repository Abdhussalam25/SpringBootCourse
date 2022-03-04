package methodoverloading;

public class Addition {
	public void add(int num1,int num2) {
		System.out.print("\nsum is:"+(num1+num2));
	}
	public int add() {
		int num1=12,num2=13;
		return(num1+num2);
	}
	
	public float add(float num1,float num2) {
		return(num1+num2);
	}
	
	public String add(String str1,String str2) {
		return(str1+" "+str2);
	}

}
