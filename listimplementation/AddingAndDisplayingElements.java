package listimplementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AddingAndDisplayingElements {

	public static void main(String[] args) {
		List list=new ArrayList();
		System.out.print("\nSize of list is :"+list.size());
		System.out.print("\nlist is :"+list);
		
		//storing string
		list.add("India");
		
		//storing integers
		list.add(456);
		
		//storing boolean value
		list.add(false);
		
		System.out.print("\nSize of list is :"+list.size());
		System.out.print("\nlist is :"+list);
		//storing Double type
		list.add(567.789D);
		
		list.add("Indian");
		
		list.add(null);
		System.out.print("\nSize of list is :"+list.size());
		
		//Different ways to store elements from Collection framework
		//1.
		System.out.print("\nlist is :"+list);
		
		//2.
		System.out.println();
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"\t");
		}
		
		//3.
		System.out.println();
		for(Object object:list) {
			System.out.print(object+"\t");
		}
		
		//4.
		//with helf of iterator
		System.out.println();
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
		
		//5.
		//with helf of ListIterator
		System.out.println();
	    ListIterator litr=list.listIterator();
	    //display in forward direction
		while(litr.hasNext()) {
			System.out.print(litr.next()+"\t");
		}
		
		//display in backward direction
		System.out.println();
		while(litr.hasPrevious()) {
			System.out.print(litr.previous()+"\t");
		}
		
		class Student{
			int rollno;
			String firstName;
			float marks;
			
			public String toString() {
				return("\nRollno:"+rollno+", First Name:"+firstName+", Marks:"+marks);
			}
			Student(int rollno,String firstName,float marks){
				this.rollno=rollno;
				this.firstName=firstName;
				this.marks=marks;
			}
		};
		List <Student>students=new ArrayList<Student>();
		students.add(new Student(12,"Jitendra",89));
		students.add(new Student(13,"Manish",67));
		students.add(new Student(14,"Rabindra",76));
		students.add(new Student(15,"Arvind",99));
		for(Student student:students) {
			System.out.println(student);
		}
		

	}

}
