package com.mahendra.demo3.dao;

import com.mahendra.demo3.models.Account;

public class Main2 {

	public static void main(String[] args) {
		DataStore store = new DataStore();
		AccountDAO dao = new AccountDAO(store);
		
		System.out.println("Search for account 102");
		Account account = dao.findByAccountNo(102);
		System.out.println("Account details "+account);
		
		System.out.println("All accounts");
		for(Account a : dao.getAll()) {
			System.out.println(a);
		}
	}

}
