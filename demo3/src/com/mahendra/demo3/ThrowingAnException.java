package com.mahendra.demo3;

//TODO: Create user defined exception 'AccountNotActiveException'
//And replace all references to AccountNotActiveException with AccountNotActiveException
public class ThrowingAnException {

	public static void main(String[] args) {
		System.out.println("Transfer ::::");
		transfer(12000,1002,1004);//try-catch #3
		System.out.println("End of main");
	}
	
	static void transfer(double amount,int fromAcc, int toAcc) {
		System.out.println("About to transfer Rs "+amount +" from "+fromAcc+" to "+toAcc);
		try {
		withdraw(amount,fromAcc);
		deposit(amount,toAcc); //try-catch #2
		System.out.println("Transfer completed....");
		}catch(AccountNotActiveException ex) {
			System.out.println("Transfer failed "+ex.getMessage());
		}
	}

	//Throws clause does TWO things:
	//1 For Unchecked exceptions, it gives a message to caller method that TRY-CATCH is required
	//2 For checked exceptions, it informs COMPILER that, exception would be handled (TRY-CATCH) in caller method
	static void withdraw(double amount,int acc) throws AccountNotActiveException {
		if(acc == 1001 || acc == 1004) {
			throw new AccountNotActiveException("Account "+acc+ " is inactive, cannot withdraw amount");
		} 
		System.out.println("Rs "+amount+" withdrawn from  account #"+acc);		
	}
	static void deposit(double amount, int acc ) throws AccountNotActiveException{
		if(acc == 1001 || acc == 1004) {
			throw new AccountNotActiveException("Account "+acc+ " is inactive, cannot deposit amount"); //try-catch #1
		}
		System.out.println("Rs "+amount+" deposited into account #"+acc);
	}
}
