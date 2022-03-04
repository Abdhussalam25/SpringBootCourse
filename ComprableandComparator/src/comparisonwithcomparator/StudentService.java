package comparisonwithcomparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentService {

	public static void main(String[] args) {
		Student st1 = new Student(111,"basha",85);
		Student st2 = new Student(333,"salam",78);
		Student st3 = new Student(222,"suhayl",95);
		Student st4 = new Student(555,"fadheela",85);
		Student st5 = new Student(444,"abdhulhaady",74);
		Student st6 = new Student(666,"abdhussalam",78);
		
		List<Student> students = Arrays.asList(st1,st2,st3,st4,st5,st6);
		
//		System.out.println(students);
//		
//		Collections.sort(students, new SortByRollNo());
//		System.out.println();
//		System.out.println(students);
		
		Collections.sort(students, new SortByMarks());
		Collections.reverse(students);
		
		System.out.println(students);

	}

}
