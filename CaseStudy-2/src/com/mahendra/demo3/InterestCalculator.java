package com.mahendra.demo3;

public interface InterestCalculator {
	
	double calculate();
	
	default void printInterest() {
		System.out.println("Interest charged "+ calculate());
	}
	static void show(InterestCalculator calc) {
		System.out.println("Hello World!");
		System.out.println("Interest charged "+ calc.calculate());

	}
}
