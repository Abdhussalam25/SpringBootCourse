package com.application.exception;

public class ValidateVoterService {

	public static void main(String[] args) {
	
		ValidVoter voter = new ValidVoter("suhayl", 10);
		
		voter.validVoterAge();
		
		ValidVoter voter2 = new ValidVoter("ashrin", 33);
		
		voter2.validVoterAge();

	}

}
