package basics;

import java.util.Scanner;


public class FindFloorTilingCost {
	
	/*
	 * Jitendra has a floor of x feet length and y feet breath. He wants to make tiled floor
	 * Now floor tiles comes  in packet of 4 tiles(AXB sqft area)
	 * Labour cost and material cost for tiling is Rs P/sqft
	 * Write code to get values from user to find out floor area, no of tiles packet required and 
	 * total estimated cost  for floor tiling. 
	 * 
	 * */
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int length,breath,area=0;	
		
		
		System.out.print("\n Enter your length : ");
		length = sc.nextInt();
		System.out.print("\n Enter your breath : ");
		breath = sc.nextInt();		
		area =  findArea(length,breath);
		
		int  noOfTilesPockets = findNoOfPockets(area);	
		
		String EstimatedCost = findEstimatedCost(area,noOfTilesPockets);
		
		System.out.println("\nYour area is "+ area);
		System.out.println("\nNo  of Tiles Pockets required : " +noOfTilesPockets );
		System.out.println("\nEstimated Cost : " +EstimatedCost );
		
		
		

	}

	private static String findEstimatedCost(int area, int noOfTilesPockets) {
		
		return area + "*P Rupees";
	}

	private static int findNoOfPockets(int area) {
		
		return area/4;
	}

	private static int findArea(int length, int breath) {
		
		return length*breath;
	}

}
