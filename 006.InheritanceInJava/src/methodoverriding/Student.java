package methodoverriding;

public class Student extends Person{
	private String course;
	
	public void showData() {
		super.showData();
		System.out.print("\ncourse="+course);
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName, String lastName, String contactNumber,String course) {
		super(firstName, lastName, contactNumber);
		this.course=course;
	}
	

}
