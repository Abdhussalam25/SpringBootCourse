package com.training.singleinheritance;
public class Service {
	public static void main(String[] args) {
		Person person=new Person("Sanjay","Kumar","9818254421");
		System.out.print(person);
		System.out.print("\nFirst Name:"+person.getFirstName()+", Last Name:"+person.getLastName());
		person.setLastName("Chandel");
		System.out.print("\nFirst Name:"+person.getFirstName()+", Last Name:"+person.getLastName());
		
		Employee emp=new Employee(123, "Sanjay", "Kumar", "8587001003", "IT", 260000);
		System.out.println(emp);
	}
}
