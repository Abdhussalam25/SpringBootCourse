package com.entity;

public class ContractualEmployee extends Employee {

	 private float payPerHour;
     private String projDuration;
	public ContractualEmployee() {
		super();
	}
	public ContractualEmployee(float payPerHour, String projDuration) {
		super();
		this.payPerHour = payPerHour;
		this.projDuration = projDuration;
	}
	public float getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(float payPerHour) {
		this.payPerHour = payPerHour;
	}
	public String getProjDuration() {
		return projDuration;
	}
	public void setProjDuration(String projDuration) {
		this.projDuration = projDuration;
	}
	@Override
	public String toString() {
		return "ContractualEmployee [payPerHour=" + payPerHour + ", projDuration=" + projDuration + ", toString()="
				+ super.toString() + "]";
	}
     
     
	
}
