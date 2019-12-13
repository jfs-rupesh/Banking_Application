package com.demo.service;

import com.demo.entity.Customer;

public interface CustomerService {

	void addCustomer(Customer customer);

	void updateCustomer(Customer customer);

	void removeCustomer(Customer customer);

	Customer findCustomerById(int id);

}