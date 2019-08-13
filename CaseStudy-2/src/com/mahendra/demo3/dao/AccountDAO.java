package com.mahendra.demo3.dao;

import java.util.LinkedList;
import java.util.List;

import com.mahendra.demo3.exceptions.AccountNotFoundException;
import com.mahendra.demo3.models.Account;

public class AccountDAO {
	private DataStore store ;
	
	public AccountDAO(DataStore store) {
		this.store = store;
	}
	//TODO:
	// 1. public void save(Account acc)
	// 2. public void changeHolderName(int acc, String newname)
	// 3. public void delete(int accNo)
	public Account findByAccountNo(int accountNo) {
		Account acc = store.getAccounts().get(accountNo);
		if(acc == null ) {
			throw new AccountNotFoundException("Account "+accountNo+" does not exists!");
		}
		return acc;
	}
	
	public List<Account> getAll(){
		List<Account> temp = new LinkedList<Account>();
		temp.addAll(store.getAccounts().values());
		return temp;
	}
}
