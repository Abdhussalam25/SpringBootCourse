package set.hashset;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int sizeOfList;
		System.out.println("Enter the size of your list");
		sizeOfList = sc.nextInt();
		
		Set<Integer> hset = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0;i<sizeOfList; i++) {
			System.out.println("Enter the number: ");
			int x = sc.nextInt();
			list.add(x);			
		}
		hset.addAll(list);
		System.out.println("Elements inside the collection :" + hset);
		
		System.out.println("No of duplicate elements removed : " + (list.size() - hset.size()));

	}

}
