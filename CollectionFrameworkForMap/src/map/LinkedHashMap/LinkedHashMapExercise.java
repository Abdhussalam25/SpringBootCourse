package map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedHashMapExercise {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the short name");
		
		String shname = sc.next();
		
		System.out.println("Enter the Full name");
		
		String fname = sc.next();
		
		FullName fullname = new FullName();
		
		fullname.add(shname, fname);		

		
		System.out.println("Enter the Key to search name");	
		
		String searchKey = sc.next();
		
		String fullName = fullname.search(searchKey);
		
		if(fullName !=  null) {
			
			System.out.println("Yes key found Full name is " + fullName);
		}else {
			
			System.out.println("Not Found");
		}
		
		
		
		
	
		
		
		
		
		
		
		
		
	}
	
	
}
