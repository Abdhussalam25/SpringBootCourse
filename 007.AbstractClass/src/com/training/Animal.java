package com.training;

public abstract class Animal {
	public void showData(String animal,String color) {
		System.out.println(animal+" has "+color+ " in color");
	}
	abstract public void speak();

}
