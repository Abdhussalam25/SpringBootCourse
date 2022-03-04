package com.company.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExtras {

	public static void main(String[] args) {
		int [] a = {2,4,6,1,4,5};
		//double or //long
		
		// the below method only converts primitive int
		// long and double to stream not others
		// long double int arrary can converted to stream using this way
		IntStream is = Arrays.stream(a);  //This cannot be printed directly it will show object obly
		
		//Anything to stream
		Stream s1 = Stream.of(21,31,41,51,61,1,2,3);
		
		Stream s2 = Stream.of(2,4,6,8,10);
		
		Stream s3 = Stream.concat(s1, s2).distinct();
		
		s3.forEach(b -> System.out.print(b + " "));
		
		// range of numbers to creat stream
		
		IntStream stream2_10 = IntStream.range(2, 11);
		
		stream2_10.forEach(val -> System.out.print(" "+val));
		//stream2_10.forEach(val -> System.out.print(" "+val));
		
IntStream stream2_11 = IntStream.rangeClosed(2, 11);
		
		
		System.out.println();
		stream2_11.forEach(c -> System.out.print(c + " "));
		

	}

}
