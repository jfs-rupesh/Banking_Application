package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.domain.model.Account;

//@Repository("accountRepository")
public class SavingsRepository implements AccountRepository{

	@Override
	public List<Account> getdetails() {
		List<Account> accounts = new ArrayList<Account>();
		Account technology = new Account();
		technology.setAccountId("P01");
		technology.setAccountHolderName("Rupesh");
		accounts.add(technology);
		technology = new Account();
		technology.setAccountId("P02");
		technology.setAccountHolderName("Vijay");
		return accounts;
	}

}
