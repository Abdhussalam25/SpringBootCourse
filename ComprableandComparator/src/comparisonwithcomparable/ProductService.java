package comparisonwithcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductService {

	public static void main(String[] args) {
		Product mouse =  new Product(111,"Mouse",2,450);
		Product keyboard =  new Product(222,"keyboard",3,4350);
		Product speaker =  new Product(333,"speaker",4,4050);
		Product monitor =  new Product(444,"monitor",2,5550);
		Product scanner =  new Product(555,"scanner",1,4500);
		
		List<Product> hardwareList = new ArrayList<Product>();
		
		hardwareList.add(mouse);
		hardwareList.add(speaker);
		hardwareList.add(keyboard);
		hardwareList.add(scanner);
		hardwareList.add(monitor);
		
		System.out.print("\n"+hardwareList);
		System.out.println();
		Collections.sort(hardwareList);
		System.out.println(hardwareList);
		
		Collections.reverse(hardwareList);
		
		System.out.println();
		
		System.out.println(hardwareList);
		
		//hardwareList.sort(Product);
		
		//Collections.
		
	}

	
	
	
	
}
