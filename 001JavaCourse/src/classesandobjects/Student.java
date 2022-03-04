package classesandobjects;

import java.util.Scanner;

/* 
 * Student Class:
rollno,name,subject marks(corejava,rdbms,servlet and jsp)
calculate:
total marks,avgmarks and grade:
Grade can be calculated:
marks between:>90   Grade=>A
marks between:>70   Grade=>B
marks between:>50   Grade=>C
marks between:<50   Grade=>D
inputData()
outputData()
calculateGrade()
findTotal()
findAverage()
 * 
 * 
 * */
public class Student {
	int rollno,totalMarks,corejavaMark,rdbmsMark,servletMark,jspMark;

	public Student(int rollno,  int corejavaMark, int rdbmsMark, int servletMark, int jspMark) {
		super();
		this.rollno = rollno;
		this.corejavaMark = corejavaMark;
		this.rdbmsMark = rdbmsMark;
		this.servletMark = servletMark;
		this.jspMark = jspMark;
	}
	
	public Student() {
		
	}
	
//	float avgMarks;	
//	char grade;
	
	Scanner sc =  new Scanner(System.in);
	
	
	
	public Student inputData() {
		
		System.out.println("Enter the student RollNo: ");
		rollno = sc.nextInt();
		System.out.println("Enter the student corejavaMark: ");
		corejavaMark = sc.nextInt();
		System.out.println("Enter the student rdbmsMark: ");
		rdbmsMark = sc.nextInt();
		System.out.println("Enter the student servletMark: ");
		servletMark = sc.nextInt();
		System.out.println("Enter the student jspMark: ");
		jspMark = sc.nextInt();
		
		Student st = new Student(rollno,corejavaMark,rdbmsMark,servletMark,jspMark);
		
		
		
		return st;
		
		
	}
public int findTotal(Student st) {
	
	totalMarks = st.corejavaMark + st.jspMark +st.rdbmsMark + st.servletMark;
	
	return totalMarks;
}
	
public float findAverage (int totalMarks) {
	
	float avgMarks = totalMarks/4;
	return 	avgMarks;
}
	
public char returnGrade(float avgMarks) {
	//char grade = ' ';
	
	if(avgMarks>90 )return 'A';
	else if(avgMarks>=70 && avgMarks<90) return 'B';
	else if(avgMarks>=50 && avgMarks<70) return 'C';
	else  return 'D';	
	
	
}

public static void main(String [] args) {
	
	//Student st = new Student(01,75,85,75,85);
	Student st = new Student();
	
	Student st1 = st.inputData();
	
	int totalMarks = st.findTotal(st1);
	
	float avg = st.findAverage(totalMarks);
	
	char grade = st.returnGrade(avg);
	
	System.out.println(" The student roll no is  "+ st.rollno);
	System.out.println(" Total Marks : "+ st.totalMarks);
	System.out.println(" Average Marks  " +avg);
	System.out.println(" Grade " + grade);
	
	
	
	
}
	
	
	
	
	

}
