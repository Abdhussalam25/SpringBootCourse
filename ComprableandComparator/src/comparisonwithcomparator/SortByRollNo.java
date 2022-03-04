package comparisonwithcomparator;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		if(obj1.getRollNumber()> obj2.getRollNumber()) return 1;
		else if(obj1.getRollNumber() < obj2.getRollNumber()) return -1;
		else return 0;
	}

}
