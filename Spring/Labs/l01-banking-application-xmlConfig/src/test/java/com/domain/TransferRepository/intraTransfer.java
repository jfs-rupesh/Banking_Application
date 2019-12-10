package com.domain.TransferRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.domain.model.Transaction;

public class intraTransfer implements Transfer {
	
	public List<Transaction> getTransactions() {
	Transaction t=new Transaction();
	t.setAmount(3000);

	t.setTransactionDate(new Date(04-12-2019));
	t.setTransactionId(10002);
	List<Transaction> list=new  ArrayList<Transaction>();
	list.add(t);
	return list;
	}

}
