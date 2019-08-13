package com.mahendra.demo3;

public class ThrowingAnException {

	public static void main(String[] args) {
		System.out.println("Transfer ::::");
		transfer(12000,1002,1004);
	}
	
	static void transfer(double amount,int fromAcc, int toAcc) {
		System.out.println("About to transfer Rs "+amount +" from "+fromAcc+" to "+toAcc);
		withdraw(amount,fromAcc);
		deposit(amount,toAcc);
	}

	static void withdraw(double amount,int acc) {
		if(acc == 1001 || acc == 1004) {
			throw new RuntimeException("Account "+acc+ " is inactive, cannot withdraw amount");
		} 
		System.out.println("Rs "+amount+" withdrawn from  account #"+acc);		
	}
	static void deposit(double amount, int acc ) {
		if(acc == 1001 || acc == 1004) {
			throw new RuntimeException("Account "+acc+ " is inactive, cannot deposit amount");
		}
		System.out.println("Rs "+amount+" deposited into account #"+acc);
	}
}
