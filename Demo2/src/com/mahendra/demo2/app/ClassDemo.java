package com.mahendra.demo2.app;

import com.mahendra.demo2.Account;

public class ClassDemo {
	public static void main(String[] args) {
		Account acc1 = new Account(101,"Vijay Mallya",230000D);
		Account acc2 = new Account(102,"Mehul Chowksy",231100D);

		Account acc3 = new Account();
		acc1.print();
		acc2.print();
		
		acc3.print();
		//Static Methods SHOULD be referred from CLASS instead of Object
		System.out.println("Account count: "+Account.getCountAccounts());
	}

}
