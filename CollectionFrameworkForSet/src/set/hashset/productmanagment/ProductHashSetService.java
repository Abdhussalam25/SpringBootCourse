package set.hashset.productmanagment;

import java.util.HashSet;
import java.util.Set;

public class ProductHashSetService {

	public static void main(String[] args) {
		Set<Product> productSet = new HashSet<>();
		
		Product apple = new Product(111,"Apple",4,120.5f);
		Product banana = new Product(222,"banana",6,60);
		Product grapes = new Product(333,"grapes",2,110.5f);
		Product pineapple = new Product(444,"pineapple",3,150.7f);
		
		productSet.add(apple);
		productSet.add(banana);
		productSet.add(grapes);
		productSet.add(pineapple);
		
		for(Product product: productSet) {			
			System.out.println(product);			
		}
		

	}

}
