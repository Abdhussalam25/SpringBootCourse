package com.training;

public class PolygonImplService {

	public static void main(String[] args) {
//		Square sobj=new Square();
//		sobj.draw();
//		
//		Triangle tobj=new Triangle();
//		tobj.draw();
//		
//		Hexagon hobj=new Hexagon();
//		hobj.draw();
		Polygon polygon;
		//holding Square object
		polygon=new Square();
		polygon.draw();
		
		//holding Triangle
		polygon=new Triangle();
		polygon.draw();
		
		//holding Hexagon
		polygon=new Hexagon();
		polygon.draw();
		
	}
}
