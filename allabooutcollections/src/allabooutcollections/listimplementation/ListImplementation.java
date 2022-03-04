package allabooutcollections.listimplementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListImplementation {

	public static void main(String[] args) {
		
			List list =  new ArrayList();
			
			
			list.add("india");
			
			list.add(252);
			
			list.add('a');
			
			list.add(false);
			
			
			list.add(null);
			System.out.println("Size of list is "+list.size());
			//Diffrent ways to get elements from Collction
			//1.
			for(int i=0; i<list.size();i++) {
				System.out.println(list.get(i));
				
				}
			//2.
			System.out.println(list);
			//3.
			
			for(Object obj: list) {
				System.out.print("\t" + obj);
			}
			
			//4.with the help of iterator
			Iterator itr = list.iterator();
			
			System.out.println();
			while(itr.hasNext()) {
				System.out.print(itr.next()+"\t");
			}
			
			System.out.println();
			
			//4.with the help of List iterator
			//list iterator in Left to right
			ListIterator litr = list.listIterator();
			
			System.out.println();
			while(litr.hasNext()) {
				System.out.print(litr.next()+"\t");
			}
			
		
			//5.with the help of List iterator
			//list iterator in Left to right
			
			
			System.out.println("Backward");
			System.out.println();
			while(litr.hasPrevious()) {
				System.out.print(litr.previous()+"\t");
			}
			
			System.out.println();
			
			class Student{
				int rollNo;
				String firstName;
				float marks;
				
				public Student(int rno,String name,float marks) {
					this.rollNo = rno;
					this.firstName =  name;
					this.marks = marks;
				}
				
				public String toString() {
					return ("\nRollNo "+rollNo+ " First Name " + firstName + " Marks"+marks);
				}
				
			};
			
			List <Student> studentList = new ArrayList<>();
			
			studentList.add(new Student(25,"jhon",75.0f));
			studentList.add(new Student(22,"peter",65.0f));
			studentList.add(new Student(21,"JO",50.0f));
			studentList.add(new Student(26,"jake",85.0f));
			studentList.add(new Student(30,"rose",65.0f));
			
				System.out.println(studentList);
			

	}

}
