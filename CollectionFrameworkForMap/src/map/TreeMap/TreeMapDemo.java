package map.TreeMap;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> studentTree = new TreeMap<>();
		
		studentTree.put(01, "Baasha");
		studentTree.put(02, "saravanan");
		studentTree.put(03, "maanikam");
		studentTree.put(04, "suhayl");
		studentTree.put(05, "fadheela");
		studentTree.put(06, "barani");
		studentTree.put(07, "bahubali");
		
		studentTree.ceilingEntry(04);
		System.out.println(studentTree.ceilingEntry(04)	);
		
	//	studentTree.put(null,"somethind");   //thread "main" java.lang.NullPointerException
		
	//	studentTree.put(null,null); // java.lang.NullPointerException
		studentTree.put(02,null);
		
		System.out.println(studentTree); /// Value could be null 

	}

}
