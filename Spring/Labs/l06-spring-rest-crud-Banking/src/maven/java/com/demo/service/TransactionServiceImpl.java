package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Transaction;
import com.demo.repo.TransactionRepo;

@Service
public class TransactionServiceImpl
		implements TransactionService {
	@Autowired
	TransactionRepo transactionRepo;

	@Override
	public Transaction searchTransaction(int id) {
		return transactionRepo.searchTransaction(id);
	}

	@Override
	public List<Transaction> getAllTransactions() {

		return transactionRepo.getAllTransactions();
	}

	/*
	 * @Override public void addtransaction(Transaction transaction) {
	 * 
	 * transactionRepo.addtransaction(transaction); }
	 */

	@Override
	public Transaction deleteTransaction(int id) {

		return transactionRepo.deleteTransaction(id);
	}

}
