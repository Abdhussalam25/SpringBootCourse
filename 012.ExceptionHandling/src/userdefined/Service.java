package userdefined;

public class Service {

	public static void main(String[] args) {
		try {
			if(args[0] instanceof String)
				throw new NonInegerResultException("Value should not be String..");
			int i=Integer.parseInt(args[0]);
			System.out.println(i);
		
		}catch(NonInegerResultException e) {
			System.err.println(e.getMessage());
		}

	}

}
