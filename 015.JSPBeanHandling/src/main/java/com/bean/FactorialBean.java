package com.bean;

public class FactorialBean {
	
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int number) {
		this.num = number;
	}
	
	
	public int getFactorial() {
		int fact = 1;
		for(int i=1; i<=num; i++) {
			
			fact = fact*i;
		}
		return fact;
	}

}
