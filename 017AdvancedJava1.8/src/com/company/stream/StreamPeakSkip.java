package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeakSkip {

	public static void main(String[] args) {
		
		List<String> flats = Arrays.asList("B01","B08","B11","T01","B01","B05","T07");
		List<String> flatsWithB = flats.stream().filter(a -> a.startsWith("B")).distinct().sorted().collect(Collectors.toList());
		
		System.out.println(flatsWithB);
		
		/// how to skip first 2 elements from result
		
		List<String> flatsWithB2 = flats.stream().filter(a -> a.startsWith("B")).distinct().sorted().skip(2).collect(Collectors.toList());
		
		System.out.println(flatsWithB2);
		
		//// peak()	
		
		List<String> flatsWithB3 = flats.stream().filter(a -> a.startsWith("B")).distinct().sorted().peek(System.out::println).skip(2).collect(Collectors.toList());
		
		System.out.println(flatsWithB3);
		
	}

}
