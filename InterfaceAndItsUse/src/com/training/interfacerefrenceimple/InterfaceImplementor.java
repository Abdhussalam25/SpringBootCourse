package com.training.interfacerefrenceimple;

public  class InterfaceImplementor implements Animal,Polygon,Walkable {

	@Override
	public void walk() {
		
		System.out.println("WAlking");
		
	}
	
	@Override
	public void draw() {
	
		System.out.println("Drawing");
	}

	@Override
	public void speak() {
		
		System.out.println("Speaking");
	}
	
	/// Just for creating confusion and we going to remove confusion
	
	

}
