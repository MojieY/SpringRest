package com.eric.core.repositories;

import java.util.List;

import com.eric.core.entities.Account;
import com.eric.core.entities.Blog;

public interface AccountRepo {
	
	public List<Account> findAllAccounts();
	
	public Account findAccount(Long id);
	
	public Account findAccountByName(String name);
	
	public Account createAccount(Account data);
}
