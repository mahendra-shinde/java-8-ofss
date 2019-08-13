package com.mahendra.demo3;

public class BuiltInException {
	public static void main(String[] args) {
		//TRY block for suspicious code
		try {
		System.out.println("Line 1");
		throw new StackOverflowError("out of bounds");
		//CATCH for handling exceptions from TRY block
		}catch(Exception ex) {
			System.out.println("Handled exception "+ex.getMessage());
			//HANDLE an exception
			System.out.println("Line 2");
		}
		System.out.println("Line 3");
	}
}
