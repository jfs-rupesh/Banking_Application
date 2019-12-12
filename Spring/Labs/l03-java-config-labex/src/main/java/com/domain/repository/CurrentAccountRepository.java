package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Account;
//Spring is unobtrusive....
//POJO based
public class CurrentAccountRepository implements AccountRepository{

	@Override
	public List<Account> getdetails() {
		List<Account> accounts = new ArrayList<Account>();
		Account technology = new Account();
		technology.setAccountId("P01");
		technology.setAccountHolderName("Aniket");
		accounts.add(technology);
		technology = new Account();
		technology.setAccountId("P02");
		technology.setAccountHolderName("Anmol");
		return accounts;
	}

}
