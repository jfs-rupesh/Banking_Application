package com.domain.service;

import java.util.List;

import com.domain.TransferRepository.Transfer;
import com.domain.model.Transaction;

public class transferServiceImpl implements transferService {

	private Transfer transfer=null;
	


	public void setTransfer(Transfer transfer) {
		this.transfer = transfer;
	}

	public List<Transaction> getTransactions() {
		System.out.println("list getting");
		return transfer.getTransactions();
	}
	
}
