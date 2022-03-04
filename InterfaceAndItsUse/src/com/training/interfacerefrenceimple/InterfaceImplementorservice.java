package com.training.interfacerefrenceimple;

public class InterfaceImplementorservice {

	public static void main(String[] args) {
		
		InterfaceImplementor obj =  new InterfaceImplementor();
		obj.draw();
		obj.speak();
		obj.walk();    //   here this is creating confusions
		
		// If we use Reference 
		
		Animal animal =  new InterfaceImplementor();
		Polygon polygon = new InterfaceImplementor();
		Walkable walk = new InterfaceImplementor();
		
		animal.speak(); //only speak method
		polygon.draw();//only draw method
		walk.walk();//only walk         
		
		//Reference will remove confusions whenever we have multiple implementations
		

	}

}
