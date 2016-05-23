package com.eric.rest.resources.asm;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.eric.core.entities.Account;
import com.eric.rest.mvc.AccountController;
import com.eric.rest.resources.AccountResource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

public class AccountResourceAsm extends ResourceAssemblerSupport<Account, AccountResource> {

	public AccountResourceAsm() {
		super(AccountController.class, AccountResource.class);
	}

	@Override
	public AccountResource toResource(Account account) {
		AccountResource res = new AccountResource();
		res.setName(account.getName());
		res.setPassword(account.getPassword());
		res.add(linkTo(methodOn(AccountController.class).getAccount(account.getId())).withSelfRel());
		res.add(linkTo(methodOn(AccountController.class).findAllBlogs(account.getId())).withRel("blogs"));
		return res;
	}

}
