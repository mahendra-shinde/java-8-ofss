package com.mahendra.demo3;

import java.util.HashSet;
import java.util.Set;

import com.mahendra.demo3.models.Account;
import com.mahendra.demo3.models.Card;
import com.mahendra.demo3.models.CurrentAccount;
import com.mahendra.demo3.models.DebitCard;
import com.mahendra.demo3.models.SavingAccount;

public class Main1 {

	public static void main(String[] args) {
		Set<Account> accounts = new HashSet<>();
		
		Account a1 =new SavingAccount(101, "Chris Evans", 1200, 300);
		Account a2 = new CurrentAccount(102, "Chris Hensworth", 3000, 4);
		Account a3 = new CurrentAccount(102, "Chris Gayale", 2000, 4.4);
		accounts.add(a1);
		accounts.add(a2);
		accounts.add(a3);
		
		for(Account a : accounts) {
			System.out.println(a);
		}
		
		Set<Card> cards = new HashSet<>();
		cards.add(new DebitCard(a1, 1234999, "01/20"));
		cards.add(new DebitCard(a1, 1234999, "01/20"));
		
		for(Card c : cards) {
			System.out.println(c);
		}
	}

}
