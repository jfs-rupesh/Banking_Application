package com.demo.controller;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Transaction;
import com.demo.service.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	TransactionService transactionService;

	// @RequestMapping()
	@RequestMapping(value = "/transaction")
	public List<Transaction> getAllCounties() {
		return transactionService.getAllTransactions();
	}

	@RequestMapping(value = "/transaction/search/{tid}", method = RequestMethod.GET)
	public Transaction getTransaction(@PathVariable int id) {
		return transactionService.searchTransaction(id);
	}
	
//	@RequestMapping(value = "/transaction/create/{id}/{name}/{population}")
	/*
	 * @RequestMapping(value = "/transaction/create/{id}/{name}/{population}",
	 * method = RequestMethod.POST) public List<Transaction> createtransaction(
	 * 
	 * @PathVariable String id,
	 * 
	 * @PathVariable String name,
	 * 
	 * @PathVariable String population, ModelAndView model) { Transaction
	 * transaction = new Transaction(); transaction.settransactionId(id);
	 * transaction.settransactionName(name); transaction.setPopulation(population);
	 * transactionService.addtransaction(transaction); return
	 * transactionService.getAlltransaction(); // model.setViewName("show.jsp"); }
	 */
	//@RequestMapping(value = "/transaction/delete/{id}", headers = "Accept=application/json", method = {RequestMethod.DELETE})
	//http://localhost:9002/3a-spring-rest-crud/rest/transaction/delete/2
	@RequestMapping(value = "/transaction/delete/{id}", method = {
			RequestMethod.DELETE })
	public List<Transaction> deletetransaction(
			@PathVariable int id) {
		transactionService.deleteTransaction(id);
		return transactionService.getAllTransactions();
	}
}
