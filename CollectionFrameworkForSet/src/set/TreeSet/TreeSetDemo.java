package set.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> treeSetbySET = new TreeSet<>();
		treeSetbySET.add(12);
		treeSetbySET.add(11);
		treeSetbySET.add(15);
		treeSetbySET.add(14);
		//treeSetbySET.p// not showing
		
		//treeSetbySET  The special methods belongs to Treeset is not showing
		
		System.out.println(treeSetbySET);
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		treeSet.add(11);
		treeSet.add(12);
		treeSet.add(15);
		treeSet.add(14);
		
		System.out.println(treeSet);
		
		//System.out.println("Removed First Element "+ treeSet.pollFirst());
	//	System.out.println("Removed last Element "+ treeSet.pollLast());
		
		System.out.println("Floor "+treeSet.floor(13));
		System.out.println("Ceiling "+treeSet.ceiling(13));
		System.out.println("Higher "+ treeSet.higher(13));
		System.out.println("Lower " + treeSet.lower(13));
		
		Iterator itr = treeSet.descendingIterator();
		
		while(itr.hasNext()) {
			
			System.out.print(" "+ itr.next());
		}
		
		
		
		
		

	}

}
