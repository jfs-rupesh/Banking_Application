package com.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banking.entity.Payee;
import com.banking.service.PayeeService;

@RestController
public class PayeeController {
	@Autowired
	private PayeeService PayeeService;

	@RequestMapping("/Payees")
	// @GetMapping("/Payees")(
	List<Payee> getPayees() {
		return PayeeService.getPayees();
	}

	@RequestMapping(value = "/Payee", method = RequestMethod.POST)
	Payee addPayee(@RequestBody Payee Payee) {
		return PayeeService.addPayee(Payee);
	}
	
	@RequestMapping(value = "/Payee", method = RequestMethod.PUT)
	Payee updatePayee(@RequestBody Payee Payee) {
		return PayeeService.updatePayee(Payee);
	}
	
	@RequestMapping(value = "/Payee/{PayeeId}", method = RequestMethod.DELETE)
	void deletePayee(@PathVariable int PayeeId) {
		 PayeeService.deletePayee(PayeeId);
	}
}