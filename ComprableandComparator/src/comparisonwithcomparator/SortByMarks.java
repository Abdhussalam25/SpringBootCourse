package comparisonwithcomparator;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		if(obj1.getMarks()> obj2.getMarks()) return 1;
		else if(obj1.getMarks() < obj2.getMarks()) return -1;
		else return 0;
	}

}
