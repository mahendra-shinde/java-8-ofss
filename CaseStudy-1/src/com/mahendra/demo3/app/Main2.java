package com.mahendra.demo3.app;

import com.mahendra.demo3.Customer;
import com.mahendra.demo3.Deposit;

public class Main2 {

	public static void main(String[] args) {
		Customer customer = new Customer(101,"Robert Downy Jr","rdj@marvel.com");
		Deposit d = new Deposit(customer, 108080, 10000, 9, 36);
		d.printInterest();
	}

}
