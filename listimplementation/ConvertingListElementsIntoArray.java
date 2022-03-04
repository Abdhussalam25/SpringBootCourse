package listimplementation;

import java.util.ArrayList;
import java.util.List;

public class ConvertingListElementsIntoArray {

	public static void main(String[] args) {
		List list=new ArrayList();
		System.out.print("\nSize of list is :"+list.size());
		System.out.print("\nlist is :"+list);
		list.add(12);
		list.add(456);
		list.add(678);
		list.add(867);
		System.out.print("\nSize of list is :"+list.size());
		System.out.print("\nlist is :"+list);
		
		//Copying all list items into java array.
		System.out.println();
		Object array[]=list.toArray();
		for(Object obj:array) {
			if(obj!=array[array.length-1])
			System.out.print(obj+", ");
			else
				System.out.print(obj);
		}
		
		//making sublist from the original list
		//list between the specified fromIndex, inclusive, and toIndex, exclusive.
		System.out.println(list.subList(1, 4));

	}

}
