package arrays;

import java.util.Scanner;

public class ArrayEvenSum {

	public static void main(String[] args) {
		int arr[];
		arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		
		
		int evenSum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			
			arr[i] = sc.nextInt();
			
			if(arr[i] % 2 == 0) 
				{
				
				evenSum += arr[i];
			//System.out.print(arr[i]);
			}
		}
		
		System.out.println("Sum of even numbers : " + evenSum);
		
		int evenTotal = 0;
		
		for(int num: arr) {
			
			if(num % 2 == 0) evenTotal += num;
			
		}
		
		System.out.println("Sum of even numbers : " + evenTotal);
		
		
	}

}
