package com.mahendra.demo3.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mahendra.demo3.models.Account;
import com.mahendra.demo3.models.Card;
import com.mahendra.demo3.models.CardNumComparator;

public class Main2 {

	public static void main(String[] args) {
		DataStore store = new DataStore();
		AccountDAO dao = new AccountDAO(store);
		
		System.out.println("Search for account 102");
		Account account = dao.findByAccountNo(102);
		System.out.println("Account details "+account);
		
		System.out.println("All accounts");
		List<Account> accs = dao.getAll();
		for(Account a : accs) {
			System.out.println(a);
		}
		
		//Sort using Default/Natural sorting method (Comparable)
		Collections.sort(accs); 
		System.out.println("After sorting...");
		for(Account a : accs) {
			System.out.println(a);
		}
		
		List<Card> cards =new ArrayList<>(store.getCards().values());
		Collections.sort(cards,new CardNumComparator());
		System.out.println("All cards");
		for(Card c : cards) {
			System.out.println(c);
		}
	}

}
