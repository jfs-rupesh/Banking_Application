package com.demo.service;

import com.demo.dao.CustomerDAOImpl;
import com.demo.dao.CustomerDao;
import com.demo.entity.Customer;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao dao;

	public CustomerServiceImpl() {
		dao = new CustomerDAOImpl();
	}


	@Override
	public void addCustomer(Customer customer) {
		dao.beginTransaction();
		dao.addCustomer(customer);
		dao.commitTransaction();
	}
	

	@Override
	public void updateCustomer(Customer customer) {
		dao.beginTransaction();
		dao.updateCustomer(customer);
		dao.commitTransaction();
	}
	

	@Override
	public void removeCustomer(Customer customer) {
		dao.beginTransaction();
		dao.removeCustomer(customer);
		dao.commitTransaction();
	}
	

	@Override
	public Customer findCustomerById(int id) {
		//no need of transaction, as it's an read operation
		Customer customer  = dao.getCustomerById(id);
		return customer;
	}
}