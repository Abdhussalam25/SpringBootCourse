package com.training;
public class WalkService {
	public static void main(String[] args) {
		Player pobj=new Player();
		pobj.walk();
		Walkable.walking();
		OldMan obj=new OldMan();
		obj.walk();
		Walkable.walking();
	}
}
