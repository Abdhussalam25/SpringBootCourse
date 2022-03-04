package com.company.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamSorted {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(22);
		numbers.add(3);
		numbers.add(41);
		numbers.add(5);
		numbers.add(63);
		numbers.add(7);
		
		// this will be in insertion order
		System.out.println(numbers);
		
		//  in ascending order
		
		System.out.println(numbers.stream().sorted().collect(Collectors.toList())     );
		
		// in ascending sort using comparator
		
		System.out.println( numbers.stream().sorted((elem1, elem2) -> elem1.compareTo(elem2)).collect(Collectors.toList()));
		
		// in DESCcending sort using comparator
		
		System.out.println( numbers.stream().sorted((elem1, elem2) -> elem2.compareTo(elem1)).collect(Collectors.toList()));

	}

}
