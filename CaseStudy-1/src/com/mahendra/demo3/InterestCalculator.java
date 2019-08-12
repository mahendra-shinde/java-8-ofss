package com.mahendra.demo3;

public interface InterestCalculator {
	
	double calculate();
	
	default void printInterest() {
		System.out.println("Interest charged "+ calculate());
	}
	
}
