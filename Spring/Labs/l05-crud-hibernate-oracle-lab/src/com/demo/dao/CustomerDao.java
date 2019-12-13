package com.demo.dao;

import com.demo.entity.Customer;

public interface CustomerDao {

	public abstract Customer getCustomerById(int id);

	public abstract void addCustomer(Customer customer);

	public abstract void removeCustomer(Customer customer);

	public abstract void updateCustomer(Customer customer);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

}
