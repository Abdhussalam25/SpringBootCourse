package com.training;

public interface Drawable {
	void draw(String object);
	default void message(String object){
	System.out.println("\nDrawing "+object+"..");
	}
}
