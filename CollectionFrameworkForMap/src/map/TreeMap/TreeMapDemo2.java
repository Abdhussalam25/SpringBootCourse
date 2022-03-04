package map.TreeMap;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> tmap =  new TreeMap<>();
		
		
		tmap.put("basha", 27);
		tmap.put("aravind", 22);
		tmap.put("manish", 25);
		
		Iterator<String> itr = tmap.keySet().iterator();
		
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.contains("a")) {
				System.out.println(str);
			}
		}
		
		

	}

}
