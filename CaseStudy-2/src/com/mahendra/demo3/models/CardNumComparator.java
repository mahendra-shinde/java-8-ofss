package com.mahendra.demo3.models;

import java.util.Comparator;


// 1. Multiple Comparator implementations for same model class
// 2. No modification of model class

// Limitation:
// 1. Not default sorting method, must explicitely provide comparator instance
// 2. Cannot access private and protected members of model class

public class CardNumComparator implements Comparator<Card> {

	@Override
	public int compare(Card o1, Card o2) {
		return o1.getCardNo()-o2.getCardNo();
	}
	
}
