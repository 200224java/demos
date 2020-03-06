package com.revature.services;

import java.util.List;

import com.revature.exceptions.TransferNegativeFundsException;
import com.revature.models.Account;
import com.revature.repository.AccountDAO;
import com.revature.repository.AccountDAOImpl;

public class AccountService {
	AccountDAO repository = null;

	public AccountService() {
		super();
		this.repository = new AccountDAOImpl();
	}

	public AccountService(AccountDAO repository) {
		super();
		this.repository = repository;
	}
	
	public List<Account> findAll() {
		return repository.findAll();
	}
	
	public int insert(Account e) {
		return repository.insert(e);
	}
	
	public boolean transfer(Account source, Account target, double amount) {
		if(amount <= 0) {
			 throw new TransferNegativeFundsException();
		}
		return repository.transfer(source, target, amount);
	}
}
