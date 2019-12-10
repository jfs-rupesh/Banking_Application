package com.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.TransferRepository.Transfer;
import com.domain.model.Transaction;

@Service("transferService")
public class transferServiceImpl implements transferService {
	@Autowired
	private Transfer transfer=null;
	


	public void setTransfer(Transfer transfer) {
		this.transfer = transfer;
	}

	public List<Transaction> getTransactions() {
		System.out.println("list getting");
		return transfer.getTransactions();
	}
	
}
