package com.demo.repo;

import java.util.List;

import com.demo.model.Transaction;

public interface TransactionRepo {
	public List<Transaction> getAllTransactions();
	//public void addTra(Transaction country);
	public Transaction deleteTransaction(int id);
	public Transaction searchTransaction(int id);
}
