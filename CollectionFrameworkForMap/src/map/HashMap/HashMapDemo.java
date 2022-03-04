package map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, String> colorHMap = new HashMap<>();
		colorHMap.put("R", "Red");
		colorHMap.put("G", "Green");
		colorHMap.put("B", "Blue");
		colorHMap.put("O", "Orange");
		
		Iterator itr = colorHMap.entrySet().iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(  itr.next() );
		}
		
		//HashMap<String,Integer> intHMap = new HashMap<>();
		
		System.out.println(colorHMap);
		
		for(String key: colorHMap.keySet()) {
			
			System.out.print
(" " + key + " ==>" + colorHMap.get(key));
		}
		
for(String value: colorHMap.values()) {
			
			System.out.println
(" " + value + " ==>" );
		}
System.out.println();

// forEach
colorHMap.forEach((key,value) -> System.out.println("key :" +key+ " value: " + value));




	}

}