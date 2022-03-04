package predefined;

public class ValidVoter {
	private String voterName;
	private int voterAge;
	public ValidVoter() {
		this.voterAge=0;
		this.voterName=null;
	}
	public ValidVoter(String voterName, int voterAge) {
		this.voterName = voterName;
		this.voterAge = voterAge;
	}
	
	public void validVoterAge() {
		try {
			if(voterAge<18 || voterAge>120) {
				throw new Exception("\nHi "+voterName+", you are not eligible for vote due to invalid age");
			}
			System.out.print("\nHi "+voterName+" you are eligible for vote");
		}catch(Exception e) {
			System.err.print(e.getMessage());
		}
	}
}
/*
get candidate year of birth and check if candidate is eligible for following or not?
1. age>=18,  eligible for vote
2. age>=21, eligible for holding driver license
3. age>=30, eligible for participate in MLA/MP election
4. age>=35, eligible for participate in President election.   		
*/
