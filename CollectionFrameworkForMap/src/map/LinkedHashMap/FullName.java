package map.LinkedHashMap;

import java.util.LinkedHashMap;

public class FullName {
	
 private String shName;
 private String fName;
 LinkedHashMap<String, String> fullName = new LinkedHashMap<>();
	public FullName(String shName, String fName) {
		super();
		this.shName = shName;
		this.fName = fName;
	}
	public FullName() {
		super();
	}
	public String getShName() {
		return shName;
	}
	public void setShName(String shName) {
		this.shName = shName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	@Override
	public String toString() {
		return "FullName [shName=" + shName + ", fName=" + fName + "]";
	}
	
	public void add(String shname, String fname) {
		//LinkedHashMap<String, String> fullName = new LinkedHashMap<>();
		
		fullName.put(shname, fname);
		
	}
 
	public String search(String key) {
		String value =null;
		boolean result = fullName.containsKey(key);
		
		if(result) {		
		 value = fullName.get(key);
		
		}
		
	
		return value;
	}
	

}
