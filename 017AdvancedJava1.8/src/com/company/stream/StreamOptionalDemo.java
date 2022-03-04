package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamOptionalDemo {

	public static void main(String[] args) {
		
		List<String> flats = Arrays.asList("B01","B08","B11","T01","B01","B05","T07");
		
	Optional<String> result =	flats.stream().filter(flat->flat.startsWith("B")).findFirst();
	if(result.isPresent())	
	System.out.println(result.get());
	else 
		System.out.println("No result found");
	
	Optional<String> result2 =	flats.stream().filter(flat->flat.startsWith("Y")).findFirst();
	if(result2.isPresent())	
	System.out.println(result2.get());
	else 
		System.out.println("No result found");

	// How to do the same in better way
	
	result.ifPresent(data -> System.out.println(data));
	//result.ifPresentOrElse(data ->System.out.println(data), System.out.println("data not found"));
	//result2.orElse("data not found"); 
	
	}

}
