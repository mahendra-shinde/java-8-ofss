package com.mahendra.demo3;

public class Calc {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		try {
		//Convert FIRST argument to INTEGER
		// Assumption #1: An argument is passed to main
		// Assumption #2: An argument passed is INTEGER
		n1 = Integer.parseInt(args[0]);
		// Assumption #1: A second argument is passed to main
		// Assumption #2: second argument is too INTEGER
		n2 = Integer.parseInt(args[1]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Too few arguments");
		}catch(NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
		int sum = n1+n2;
		System.out.println("Sum :"+sum);
	}

}
