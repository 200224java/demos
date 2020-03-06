package com.revature.repository;

import java.util.List;

import com.revature.models.Account;
import com.revature.models.Employee;

public interface AccountDAO {

	public int insert(Account a);
	
	public boolean transfer(Account source, Account target, double amount);
	
	public List<Account> findAll();
	
	public List<Account> findByOwner(Employee emp);
}
