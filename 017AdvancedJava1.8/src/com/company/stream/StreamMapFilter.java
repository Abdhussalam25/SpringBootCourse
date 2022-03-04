package com.company.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilter {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		
		fruits.add("mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kivi");
		fruits.add("Papaya");
		fruits.add("Grapes");
		
		
		// fruits length
		System.out.println(fruits.stream().map((f -> f.length())).collect(Collectors.toList()));		
		
		//Find only fruits whose length is greater than 5
		System.out.println( fruits.stream().filter(f -> f.length() > 5).collect(Collectors.toList())     );
		
		System.out.println( fruits.stream().filter(f -> f.length() > 5).map(f -> f.length()).collect(Collectors.toList())   );
		
		/// No of elements whose length freater than 5
		
		System.out.println( fruits.stream().filter(f -> f.length() > 5).count()    );
		
		
		
 
	}

}
