package com.domain.model;

public class Account {
	private String accountId;
	private String accountHolderName;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountName) {
		this.accountHolderName = accountName;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountHolderName=" + accountHolderName
				+ "]";
	}

}
