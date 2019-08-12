package com.mahendra.demo2.app;

import com.mahendra.demo2.Account;

public class ClassDemo {
	public static void main(String[] args) {
		Account acc1 = new Account(101,"Vijay Mallya",230000D);
		Account acc2 = new Account(102,"Mehul Chowksy",231100D);
		
		acc1.print();
		acc2.print();
	}

}
