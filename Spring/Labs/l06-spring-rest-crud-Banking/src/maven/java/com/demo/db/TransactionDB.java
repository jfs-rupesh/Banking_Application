package com.demo.db;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Transaction;

public class TransactionDB {
	private static ArrayList<Transaction> transactionList = new ArrayList<Transaction>();

	static {

		transactionList.add(new Transaction("25000001", "AC20003", "12:06:"));
		transactionList.add(new Transaction("2500002", "AC2004", "1:55"));
		transactionList.add(new Transaction("2500003", "AC2005", "3:57"));
	
	}

	public static ArrayList<Transaction> gettransactionList() {

		return transactionList;
	}

	public static void settransactionList(List<Transaction> transactionList) {

		TransactionDB.transactionList = (ArrayList<Transaction>) transactionList;
	}
}
