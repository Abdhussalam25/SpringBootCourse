package map.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lhmap = new LinkedHashMap<>();
		
		int size = lhmap.size();
		
		System.out.println("\n lhmap is empty: "+lhmap.isEmpty());
		
		lhmap.put("Aravind", 21);
		lhmap.put("basha", 23);
		lhmap.put("harsha", 24);
		lhmap.put("Manish", 26);
		lhmap.put("jit", null);
		lhmap.put("jit2", null);
		lhmap.put(null, null);
		lhmap.put(null, null);
		lhmap.put("jit2", 32);		
		
		System.out.println(lhmap);
		
		
		

	}

}
