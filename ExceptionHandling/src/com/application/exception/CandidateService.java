package com.application.exception;

import java.util.Scanner;

public class CandidateService {

	public static void main(String[] args) throws Exception {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the name");
		
		String name = sc.next();
		
		System.out.println("Enter the year in yyyy format ");
		
		int age  = sc.nextInt();
		
		Candidate candidate =  new Candidate(name,age);
//		
//		
		candidate.classifyAge();
		
		//Candidate candidate1 =  new Candidate("jhon", 1975);
		
//		Candidate candidate2 =  new Candidate("peter", 1945);
//		
//		Candidate candidate3 =  new Candidate("maya", 2018);
		
		//candidate1.classifyAge();
//		candidate2.classifyAge();
//		candidate3.classifyAge();
		
		
		
		

	}

}
