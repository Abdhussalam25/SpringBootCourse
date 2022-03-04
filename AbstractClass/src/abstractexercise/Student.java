package abstractexercise;

public abstract class Student {
	
	/*
	 * Create an abstract class called Student. 
	 * The Student class includes a name and a boolean value representing 
	 * full-time status. Include an abstract method to determine the tuition, 
	 * with full-time students paying a flat fee of $2000 and 
	 * part-time students paying $200 per credit hour. 
	 * Create two subclasses called FullTime and PartTime. 
	 * Create an application that demonstrates
	 *  how to create objects of both subclasses. 
	 *  Save the files as Student.java, FullTime.java, 
	 *  PartTime.java, and UseStudent.java.
	 */	
	private String name;
	private boolean fullTimeStatus;
	private float fee;
	
	
	
	
	
	public Student(String name, boolean fullTimeStatus) {
		super();
		this.name = name;
		this.fullTimeStatus = fullTimeStatus;
		
	}

	public abstract void determineTution();

	

	public void setFee(float fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", fullTimeStatus=" + fullTimeStatus + ", fee=" + fee + "]";
	}
	
	
	

	
	

}
