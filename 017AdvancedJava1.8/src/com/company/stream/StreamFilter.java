package com.company.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		
		System.out.println(numbers);
		
		//To find oddnumbers
		List<Integer> oddNumbers = new ArrayList<>();
		
		for(Integer num: numbers) {
			if(num %2 != 0) oddNumbers.add(num);
			
		}
		System.out.println(oddNumbers);
		
		// using Stream
		
		//Stream <Integer> stream = numbers.stream();
		//oddNumbers = numbers.stream().filter(num -> num%2 != 0).collect(Collectors.toList());
		
		//using predicate
		Predicate<Integer> oddEvenPredicate = num -> num%2 !=0;
		
		oddNumbers = numbers.stream().filter(oddEvenPredicate).collect(Collectors.toList());
		
		System.out.println(oddNumbers);
		
		
		
		
		
		
		
		

	}

}
