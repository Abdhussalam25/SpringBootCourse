package methodoverloading;

public class AddNumbers {
	public double add(double ...num) {
		double sum=0;
		for(double n:num) {
			sum+=n;
		}
		return(sum);
 }
}
