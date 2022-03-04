package set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer>  linkedHashSet = new LinkedHashSet<Integer>();
		
		
		linkedHashSet.add(12);
		linkedHashSet.add(13);
		linkedHashSet.add(14);
		linkedHashSet.add(15);
		linkedHashSet.add(16);
		linkedHashSet.add(17);
		linkedHashSet.add(18);
		
		System.out.println(linkedHashSet);
		
		Iterator itr = linkedHashSet.iterator(); 
		
		while(itr.hasNext()) {
			System.out.print("\t" + itr.next());
		}
		
		
		
		

	}

}
