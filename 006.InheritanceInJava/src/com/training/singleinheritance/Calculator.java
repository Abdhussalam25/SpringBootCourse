package com.training.singleinheritance;

public class Calculator extends Numbers{
	public int add() {
		int temp=0;
		temp=this.getNum1()+this.getNum2();
		return(temp);
	}
	public int sub() {
		int temp=0;
		temp=this.getNum1()-this.getNum2();
		return(temp);
	}
	public int mul() {
		int temp=0;
		temp=this.getNum1()*this.getNum2();
		return(temp);
	}
	public int div() {
		int temp=0;
		temp=this.getNum1()/this.getNum2();
		return(temp);
	}
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calculator(int num1, int num2) {
		super(num1, num2);
	}
	
}
