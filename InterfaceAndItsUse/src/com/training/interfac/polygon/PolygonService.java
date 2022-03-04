package com.training.interfac.polygon;

public class PolygonService {

	public static void main(String[] args) {
		
		Triangle tri = new Triangle();
		tri.draw();
		
		Square sqre = new Square();
		sqre.draw();
		
		Polygon square =  new Square(); // this is the best practise
		
		Polygon trianlge =  new Triangle(); // this is the best practise
		
		square.draw();
		trianlge.draw();
		
		
	}

}
