package set.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {

     
		HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,7,9));
		
		Set<Integer> s2 = new HashSet<>(Arrays.asList(1,3,5,7,9));
		
		
		
		 s1.addAll(s2);
		
		// System.out.println("Elemenets present in the second set are " + s1);	
		 
		 s1.removeAll(s2);	 
		// System.out.println(s1);	 
		 
		s2.addAll(s1);
		
		 System.out.println(s2);
		 
		 
		 
		// System.out.println(s1);
		 
		 
		 
		 
		
		
		
		
		
	    
		
	}

}
