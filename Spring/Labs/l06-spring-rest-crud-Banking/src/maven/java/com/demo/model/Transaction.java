package com.demo.model;

public class Transaction {
	private String transactionId;
	private String accountNumber;
	private String time;
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", accountNumber="
				+ accountNumber + ", time=" + time + "]";
	}
	public Transaction(){
		
	}
	public Transaction(String transactionId, String accountNumber, String time) {
		super();
		this.transactionId = transactionId;
		this.accountNumber = accountNumber;
		this.time = time;
	}

}
