package com.training;

public class AnimalService {
	public static void main(String args[]) {
		Dog dog=new Dog();
		dog.showData("Dog", "Black");
		dog.speak();
		
		Lion lion=new Lion();
		lion.showData("Lion", "White");
		lion.speak();
	}
	
	

}
