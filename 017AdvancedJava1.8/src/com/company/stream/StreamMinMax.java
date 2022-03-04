package com.company.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMinMax {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(55,22,1,48,101,77);
		
		List<Integer> duplicateNumList = Arrays.asList(55,22,1,48,101,77,1,48,101,77);
		
		int minValue = numList.stream().min(StreamMinMax::sortElements).get();
		
		//int maxValue = numList.stream().max((a,b) -> {return a.compareTo(b);}).get();
		
		int maxValue = numList.stream().max(StreamMinMax::sortElements).get();
		
		System.out.println("Min Value " + minValue + " Max Value " + maxValue);
		
		System.out.println("============");
		
		duplicateNumList.stream().sorted().forEach(a -> System.out.print(a + " "));
		
		System.out.println();
		
		duplicateNumList.stream().distinct().sorted().forEach(a -> System.out.print(a + " "));
		
	}
	
	public static Integer sortElements(Integer a, Integer b) {
		
		return a.compareTo(b);
	}

}
