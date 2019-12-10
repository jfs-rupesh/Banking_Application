package com.domain.TransferRepository;

import java.util.List;

import com.domain.model.Transaction;


public interface Transfer {
	List<Transaction> getTransactions();
}
