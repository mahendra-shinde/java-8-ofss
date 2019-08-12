package com.mahendra.demo2.app;

import com.mahendra.demo2.Account;
import com.mahendra.demo2.SavingsAccount;

public class InheritanceDemo {

	public static void main(String[] args) {

		//Implicit UPCasting
		Account a1 = new SavingsAccount(102,"Nirav", 1200);
		
		//Explicit DownCasting
		//Possibility of exception
		SavingsAccount sc1 = (SavingsAccount) a1;
	}

}
