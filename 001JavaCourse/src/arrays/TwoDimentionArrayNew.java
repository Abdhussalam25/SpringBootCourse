package arrays;

public class TwoDimentionArrayNew {

	public static void main(String[] args) {
		
		int[][] newArray = {  
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int [][] jaggedArray = { //Non identical arrays are called as jaggedArray
				{1,2,3},
				{4,5},
				{6,7,8,9,10}
				
								};
		
		int [][] jaggedArry2 = {
				
				{1,2,3},
				{1},
				{4,5,6,7,8},
				{12,23,34,45,56}
		};
		
		
		for(int i = 0; i<jaggedArry2.length; i++) {
			
			for(int j = 0; j < jaggedArry2[i].length; j++) {
				
				System.out.print(" \t " +jaggedArry2[i][j]);
				
			}
			
			System.out.println();
			
		}
		
		
		
				                
		}

	

}
