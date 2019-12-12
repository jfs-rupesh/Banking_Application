package com.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.domain.repository.CurrentAccountRepository;
import com.domain.repository.AccountRepository;
import com.domain.service.AccountService;
import com.domain.service.AccountServiceImpl;

//@Configuration
public class AppConfig {
	@Bean(name = "accountService")
	public AccountService getAccountService() {
		//constructor injection
		AccountService accountService = new AccountServiceImpl(getAccountRepository());
		return accountService;
	}

	@Bean(name = "accountRepository")
	public AccountRepository getAccountRepository() {
		return new CurrentAccountRepository();
	}
}
