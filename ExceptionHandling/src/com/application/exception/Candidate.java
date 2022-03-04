package com.application.exception;

public class Candidate {
	
	/*
	get candidate year of birth and check if candidate is eligible for following or not?
	1. age>=18,  eligible for vote
	2. age>=21, eligible for holding driver license
	3. age>=30, eligible for participate in MLA/MP election
	4. age>=35, eligible for participate in President election.           
	*/
	
	String name;
	int yearOfBirth;
	int age;
	
	
	
	public Candidate() {
		super();
	}

	public Candidate(String name, int yearOfBirth) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}
	
	
	
	
	private int calculateAge() {
		
		age = 2022 - yearOfBirth;
		
		return age;
	}
	
	public void classifyAge()  {
		
		age = calculateAge();
		
		
		try {
		if(age < 18 || age > 120) {
			
			throw new Exception("Sorry "+ name + "You are not eligible to vote or getting driving licence or  "
					+ "being a candidate as MP/MLA or president  ");
			
			
		}else if(age >= 18 && age < 21) {
			
			throw new Exception("Hi "+ name + "You are eligible to vote but not eligile for getting driving licence or  "
					+ "being a candidate as MP/MLA or president  ");
		}else if(age >= 21 && age < 30) {
			
			throw new Exception("Hi "+ name + "You are eligible to vote and eligile for getting driving licence   "
					+ "but not eligible being a candidate as MP/MLA or president  ");
		}else if(age >= 30 && age < 35) {
			
			throw new Exception("Hi "+ name + "You are eligible to vote and eligile for getting driving licence and  "
					+ " being a candidate as MP/MLA  but not eligible president  ");
		}else if(age >= 35 ) {
			
			throw new Exception("Hi "+ name + "You are eligible to vote and eligile for getting driving licence and  "
					+ " being a candidate as MP/MLA  but not eligible president  ");
		}else {
			
			System.out.println("The age is not valid kindly enter valid age");
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	

}
