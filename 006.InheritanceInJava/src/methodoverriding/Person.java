package methodoverriding;

public class Person {
	private String firstName;
	private String lastName;
	private String contactNumber;
	
	public void showData() {
		String person= "\nfirstName=" + firstName + ", lastName=" + lastName + ", contactNumber=" + contactNumber;
		System.out.print(person);
	}

	public Person(String firstName, String lastName, String contactNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", contactNumber=" + contactNumber + "]";
	}
	

}
