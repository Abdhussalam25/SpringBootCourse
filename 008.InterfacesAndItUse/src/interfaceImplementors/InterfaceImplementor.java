package interfaceImplementors;

public class InterfaceImplementor implements Animal,Polygon,Walkable{

	@Override
	public void walk() {
		System.out.println("Walking is a good exercise..");
		
	}

	@Override
	public void draw() {
		System.out.println("Triangle is drawn..");
		
	}

	@Override
	public void speak() {
		System.out.println("Always speak softly..");
		
	}

}
