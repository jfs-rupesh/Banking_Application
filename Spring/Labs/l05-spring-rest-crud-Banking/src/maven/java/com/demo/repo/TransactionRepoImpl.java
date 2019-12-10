package com.demo.repo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.demo.db.TransactionDB;
import com.demo.model.Transaction;

@Repository
public class TransactionRepoImpl
		implements TransactionRepo {

	@Override
	public List<Transaction> getAllTransactions() {

		return TransactionDB.gettransactionList();
	}

	/*
	 * @Override public void addtransaction(Transaction transaction) {
	 * 
	 * TransactionDB.gettransactionList().add(transaction); }
	 */

	@Override
	public Transaction deleteTransaction(int id) {

		return TransactionDB.gettransactionList().remove(id);
	}

	@Override
	public Transaction searchTransaction(int id) {
		//Java 8 Stream API
		Stream<Transaction> transactionListStream = TransactionDB.gettransactionList().stream();
		Stream<Transaction> transactionListFilteredStream = transactionListStream.filter(transaction -> Integer.parseInt(transaction.getTransactionId()) == id);
		Optional<Transaction> searchtransactionOptional = transactionListFilteredStream.findFirst();
		Transaction searchtransaction = searchtransactionOptional.get();
		return searchtransaction;
		
//	return transactionDB.gettransactionList().stream()
//	.filter(c -> Integer.parseInt(
//			c.gettransactionId()) == id)
//	.findFirst().get();
	}
}
