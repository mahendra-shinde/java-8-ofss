package com.mahendra.demo4;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
 public static void main(String[] args) {
	Set set = new HashSet();
	System.out.println(set.add(1000));
	System.out.println(set.add(1000));
	System.out.println(set.add(1000));
	System.out.println(set.add("Abc"));
	System.out.println(set.add("Xyz"));
	System.out.println(set.add("Xyz"));
	
	for(Object o : set) {
		System.out.println(o);
	}
}
}
