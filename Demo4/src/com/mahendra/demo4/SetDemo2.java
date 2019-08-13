package com.mahendra.demo4;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
 public static void main(String[] args) {
	Set<Number> set = new HashSet<Number>();
	System.out.println(set.add(1000));
	System.out.println(set.add(1000));
	System.out.println(set.add(1000));
//	System.out.println(set.add("Abc"));
//	System.out.println(set.add("Xyz"));
//	System.out.println(set.add("Xyz"));
	
	for(Object o : set) {
		System.out.println(o);
	}
}
}
