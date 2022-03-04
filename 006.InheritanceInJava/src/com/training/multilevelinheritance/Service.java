package com.training.multilevelinheritance;

import com.training.singleinheritance.Person;

public class Service {

	public static void main(String[] args) {
		Person pobj=new Person("Rabindra","Kumar","8587001003");
		System.out.println(pobj);
		
		Student sobj=new Student("Lalitha","Singh","9818254421","FSD");
		System.out.println(sobj);
		
		Employee emp=new Employee("Jitendra","Pandey", "9910587200", "System Admin",
				234,45600);
		System.out.println(emp);

	}

}
