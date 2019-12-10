package com.demo.service;

import java.util.List;

import com.demo.model.Transaction;

public interface TransactionService {
	public List<Transaction> getAllTransactions();

	/* public void addTransaction(Transaction Transaction); */

	public Transaction deleteTransaction(int id);

	public Transaction searchTransaction(int id);
}
