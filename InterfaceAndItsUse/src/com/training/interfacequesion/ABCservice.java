package com.training.interfacequesion;

public class ABCservice {

	public static void main(String[] args) {
		
		ABCimplementor abc = new ABCimplementor();
		
		//System.out.println(abc.i);
		
		A a  = new ABCimplementor();
		B b  = new ABCimplementor();
		C c  = new ABCimplementor();
		
		System.out.println(a.i);
		System.out.println(b.i);
		System.out.println(c.i);

	}

}
