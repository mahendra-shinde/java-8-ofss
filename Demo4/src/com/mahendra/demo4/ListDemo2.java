package com.mahendra.demo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		List data = new LinkedList();
		data.add("Abc");
		data.add(1000.0);
		data.add(1000.0);
		data.add(1000.0);
		data.add("Xyz");
		data.add(0, "mahendra");

		Iterator it = data.iterator();
		System.out.println("List elements: ");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Object o : data) {
			System.out.println(o);
		}
	}

}
