package set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>();
		Set<String> hashSet2 = new HashSet<>();
		hashSet.add("1");
		hashSet.add("2");
		hashSet.add("3");
		hashSet.add("4");
		hashSet.add("5");
		hashSet.add("1");
		hashSet.add("null");
		System.out.println(hashSet.add("null"));
		
		System.out.println(hashSet.size());
		
//		Iterator i = hashSet.iterator();
//		while(i.hasNext()) {
//			System.out.println(" Values of set "+i.next());
//		}
		
		System.out.println("Hash set is " + hashSet);

		try {
			boolean status = hashSet.contains("31");
			if(status) {
				throw new Exception("This element is already exist and it will not allowed");
			}else {
				hashSet.add("31");
				System.out.println("Element added succesfully");
				
			}
		}catch(Exception e) {
			System.err.println(e.getLocalizedMessage());
			//e.printStackTrace();
			// any  one is enough either e.getmessage or printstac
		}
		
		hashSet2.add("1");
		hashSet2.add("3");
		hashSet2.add("5");
		hashSet2.add("7");
		hashSet2.add("9");
		hashSet2.add("11");
		
		System.out.println(hashSet);

		System.out.println(hashSet2);
		//hashSet.addAll(hashSet2);
		
		hashSet.retainAll(hashSet2);
		
		System.out.println("After intersection " + hashSet);
		
		

	}

}
