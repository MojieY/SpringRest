package com.eric.test.core.repositories;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.eric.core.entities.Account;
import com.eric.core.repositories.AccountRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:edu/stevens/resources/spring/business-config.xml")
public class AccountRepoTest {

	@Autowired
	private AccountRepo repo;
	
	private Account account;

	@Before
	@Transactional
	@Rollback(false)
	public void setup(){
		account = new Account();
		account.setName("name");
		account.setPassword("password");
		repo.createAccount(account);
	}

	@Test
	@Transactional
	public void test() {
		assertNotNull(repo.findAccount(account.getId()));
	}
}
