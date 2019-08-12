package com.mahendra.demo3.app;

import com.mahendra.demo3.Account;
import com.mahendra.demo3.Card;
import com.mahendra.demo3.CreditCard;
import com.mahendra.demo3.InterestCalculator;
import com.mahendra.demo3.SavingAccount;

public class Main1 {

	public static void main(String[] args) {
		Account ac1 = new SavingAccount(1001, "Rahul", 14000, 500);
		Card c1 = new CreditCard(ac1,10029099,"03/25",0.14,100000,34000);
		ac1.printInterest();
		InterestCalculator calc = (InterestCalculator)c1;
		calc.printInterest();

	}

}
