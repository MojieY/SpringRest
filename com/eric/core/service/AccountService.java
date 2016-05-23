package com.eric.core.service;

import com.eric.core.entities.Account;
import com.eric.core.entities.Blog;
import com.eric.core.service.util.AccountList;
import com.eric.core.service.util.BlogList;

public interface AccountService {
	
	public Account findAccount(Long id);

	public Account createAccount(Account data);

	public Blog createBlog(Long accountId, Blog data);

	public BlogList findBlogsByAccount(Long accountId);

	public AccountList findAllAccounts();

	public Account findByAccountName(String name);
}