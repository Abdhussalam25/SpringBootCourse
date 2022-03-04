package inheritancecollegecourse;

public class LabCourse extends CollegeCourse {

	public LabCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LabCourse(String department, int courseNumber, int credit) {
		super(department, courseNumber, credit);
		
	}
	
	float CourseFee;;
	
	private float calculateFee() {
		//int hour;
//		Scanner sc  = new Scanner(System.in);
//		System.out.println("Enter the no of hour for course : ");
		//hour =  sc.nextInt();
		courseFee = (credit * 120) + 50;
		
		return courseFee;
		
	}

	@Override
	public String toString() {
		return "LabCourse [CourseFee=" + CourseFee + ", department=" + department + ", courseNumber=" + courseNumber
				+ ", credit=" + credit + ", courseFee=" + courseFee + "]";
	}
	
	
	public void display() {
		calculateFee();
		System.out.println(this);
		
	}
	
	
	

}
