package com.mahendra.demo4;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("A",1000);
		map.put("B",1200);
		map.put("C","Abcd");
		
		System.out.println("Find A: "+map.get("A"));
		System.out.println("Find C: "+map.get("C"));
	}

}
