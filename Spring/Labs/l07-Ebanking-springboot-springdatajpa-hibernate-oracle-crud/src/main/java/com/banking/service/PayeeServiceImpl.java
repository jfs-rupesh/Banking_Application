package com.banking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.entity.Payee;
import com.banking.repository.PayeeJPARepository;
@Service
public class PayeeServiceImpl implements PayeeService{
    @Autowired
	private PayeeJPARepository payeeJPARepository;
	@Override
	public List<Payee> getPayees() {
		return payeeJPARepository.findAll();
	}
	@Override
	public Payee addPayee(Payee payee) {
		return payeeJPARepository.save(payee);
	}
	@Override
	public Payee updatePayee(Payee payee) {
		return payeeJPARepository.save(payee);
	}
	@Override
	public void deletePayee(int payeeId) {
		payeeJPARepository.deleteById(payeeId);
	}
	
}
