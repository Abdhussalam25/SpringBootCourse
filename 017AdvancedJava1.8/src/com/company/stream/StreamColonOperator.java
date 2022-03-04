package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamColonOperator {

	public static void main(String[] args) {
		
		List<String> alphaNumerics = Arrays.asList("A11","A44","a22", "a49","G66");
		
		System.out.println(alphaNumerics);
		
		System.out.println( alphaNumerics.stream().filter(a -> a.startsWith("A")).collect(Collectors.toList())  );
		
		System.out.println( alphaNumerics.stream().map( i -> i.toUpperCase()).filter(a -> a.startsWith("A")).collect(Collectors.toList()) );
		
		// alphaNumerics.stream().map(i -> i.toLowerCase()).filter(a -> a.startsWith("a")).collect(Collectors.toList()).forEach(System.out::println);
		
		/// by using colon operator:
		System.out.println("using colon on String function");
		
		alphaNumerics.stream().map(String :: toUpperCase).filter(a -> a.startsWith("A")).forEach(System.out::println);
		
		// Note colon operator can be possible only if there is no arguments bcoz we have to call without paranthesis.
		
		alphaNumerics.stream().map(String :: toUpperCase).filter(a -> a.startsWith("A")).forEach(a -> System.out.print( a + "\t "));
		
		
		
		
		
	}

}
