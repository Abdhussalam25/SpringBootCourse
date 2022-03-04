package com.training.interfac;

public interface Drawable {
	
	void draw(String object);
	default void message(String object) {
		System.out.println(" Drawing "+ object);
	}
	
	static void walking() {
		
		System.out.println("WAlking is good exercise");
	}

}
