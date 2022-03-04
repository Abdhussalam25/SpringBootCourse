package arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
	
		int [] nums= {3,7,13,20,29};
		
//		for(int i=0; i<numArray.length; i++) {
//				for(int j=1; j<numArray.length; j++) {
//					int missingNumbers = numArray[j] - numArray[i];
//					for(int k = 1; k<=missingNumbers; k++) {
//						//int value;
//						System.out.print(numArray[i] + k);
//					}
//				}
//			
//		}
		
		for(int i=0; i<nums.length-1; i++) {
			for(int j = nums[i]+1; j < nums[i+1]; j++ ) {
			
				System.out.print( " "+ j);
			}
			System.out.println();
		}

	}

}
