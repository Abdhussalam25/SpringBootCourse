package com.application.exception.nestedtry;

public class NestedTryBlock {
	public void showArrayElement(int numArray[],int i, int j) {
		try {
			try {
				try {
					
					System.out.println(numArray[i]/numArray[j]);
				}catch(NullPointerException npe) {
				  System.out.println(npe.getMessage());	
				}
			}catch(ArithmeticException ae) {
				System.out.println(ae.getMessage());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
