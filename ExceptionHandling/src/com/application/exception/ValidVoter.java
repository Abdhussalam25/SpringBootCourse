package com.application.exception;

public class ValidVoter {
	
	private String voterName;
	private int voterAge;
	public ValidVoter() {
		super();
	}
	public ValidVoter(String voterName, int voterAge) {
		super();
		this.voterName = voterName;
		this.voterAge = voterAge;
		
	}
	public String getVoterName() {
		return voterName;
	}
	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}
	public int getVoterAge() {
		return voterAge;
	}
	public void setVoterAge(int voterAge) {
		this.voterAge = voterAge;
	}
	
	public void validVoterAge() {
		try {
		if(voterAge<18 || voterAge>120) {
				throw new Exception(" \n Hi " + voterName + " Yor are not eleigible to vote due to age is invalid" );
		}
		
		System.out.println("  \n Hi "+ voterName + "You are elegible for vote");
		
		}catch(Exception e) {
			
			System.err.print(e.getMessage());
		}
		
		
			
	}
	
	
	

}
