package arrays;

import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		int twoDimen[][]; 
		
		twoDimen = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i<3; i++) {
			
			for(int j = 0; j <3; j++) {
				twoDimen[i][j] = sc.nextInt();
				
			}
		}
		
	for(int i = 0; i<3; i++) {
			
			for(int j = 0; j <3; j++) {
			System.out.print("\t " + twoDimen[i][j]);
				
			}
		}
		
		
				    
		}

	}


