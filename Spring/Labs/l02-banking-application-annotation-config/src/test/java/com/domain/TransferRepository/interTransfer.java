package com.domain.TransferRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.domain.model.Transaction;


public class interTransfer implements Transfer{
	
	public List<Transaction> getTransactions() {
	Transaction t=new Transaction();
	t.setAmount(5000);

	t.setTransactionDate(new Date(03-03-2019));
	t.setTransactionId(10001);
	List<Transaction> list=new  ArrayList<Transaction>();
	list.add(t);
	return list;
	}
}
