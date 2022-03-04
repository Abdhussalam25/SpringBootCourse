package com.training.hierarchicalinheritance;

public class Service {

	public static void main(String[] args) {
		Player pobj=new Player("Sanjay","Chandel","9818254421","Boxing");
		System.out.println(pobj);
		
		Employee eobj=new Employee(123,"Sanjay","Chandel","9818254421",23400);
		System.out.println(eobj);

	}

}
