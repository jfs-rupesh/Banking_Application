package com.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.model.Account;
import com.domain.repository.AccountRepository;

//@Service("accountService")
public class AccountServiceImpl implements AccountService {
	//Field based injection
	//@Autowired
	private AccountRepository accountRepository;
	//Constructor based injection
	//@Autowired
	public  AccountServiceImpl(AccountRepository accountRepository) {
		System.out.println("Constructor Injection : AccountServiceImpl");
		this.accountRepository = accountRepository;
	}
	//Setter based injection
	//@Autowired
	public void setAccountRepository(AccountRepository accountRepository) {
		System.out.println("Setter Injection : AccountServiceImpl");
		this.accountRepository = accountRepository;
	}
	@Override
	public List<Account> getAccounts() {
		return accountRepository.getdetails();
	}

}
