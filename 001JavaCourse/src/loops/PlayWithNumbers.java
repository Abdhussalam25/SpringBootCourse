package loops;

public class PlayWithNumbers {
	
	public void printOneToTen() {
		
		for(int i = 1; i <= 10; i++ ) {
			System.out.println(i);
		}
		
	}
	
	public void printNStars(int N) {
		
		for(int i = 0; i<=N; i++) {
			 
			 for(int j = 0; j <= i ; j++) {
				 
				 System.out.print("* ");
			 }
			 
			 System.out.println();// Note this is wery impt		
			
		}
		
		
	}
	
	public void pringInvertedNStars(int N) {
		
		for(int i = 0; i <= N; i++ ) {
			
			for(int j = N; j >= i; j-- ) {
				
				 System.out.print("* ");
			}
			System.out.println();// Note this is wery impt	
			
		}
	}
	
	public void printNumberTriangle(int N) {
		for(int i = 0; i<=N; i++) {
			 
			 for(int j = 0; j <= i ; j++) {
				 
				 System.out.print(j+" ");
			 }
			 
			 System.out.println();// Note this is wery impt		
			
		}
		
		
		
	}
	
	public void printNumbersInTriangle(int N) {
		for(int i = 1; i<=N; i++) {
			 
			 for(int j = 1; j <= i ; j++) {
				 
				 System.out.print(i+" ");
			 }
			 
			 System.out.println();// Note this is wery impt		
			
		}

		
	}
	
//	public void printSameNumberStsInTriangle(int N) {
//		for(int i = 1; i<=N; i++) {
//			 
//			 for(int j = 1; j <= i ; j++) {
//				 
//				 System.out.print(i+" ");
//			 }
//			 
//			 System.out.println();// Note this is wery impt		
//			
//		}
//
//		
//	}
	

	public static void main(String[] args) {
		
		PlayWithNumbers obj = new PlayWithNumbers();
//		obj.printNStars(10);
//		System.out.println("Wow SEE this");
//		obj.pringInvertedNStars(10);
//		
//		obj.printNumberTriangle(10);
		obj.printNumbersInTriangle(5);
		System.out.println(obj.longestStreak("XPNzzzddOOOxx"));

	}
	
	
	public  int longestStreak(String str) {
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			char matchChar = str.charAt(i);
			
			for(int j = i+1; j < str.length(); j++) {
				
				if(matchChar == str.charAt(j)) count++;
				
			}
			
			
			
		}
		
		
		
		return count;
	}

}

