package com.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.demo.entity.Customer;

public class CustomerDAOImpl implements CustomerDao{
private EntityManager entityManager = null;

	public CustomerDAOImpl() {
	entityManager = JPAUtil.getEntityManager();
}

	@Override
	public Customer getCustomerById(int id) {
		return entityManager.find(Customer.class, 100);
	}

	@Override
	public void addCustomer(Customer customer) {
		entityManager.persist(customer);
		System.out.println("Customer persisted in the database");
	}

	@Override
	public void removeCustomer(Customer customer) {
		entityManager.remove(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		entityManager.merge(customer);
	}

	@Override
	public void commitTransaction() {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.commit();
	}

	@Override
	public void beginTransaction() {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityManager.getTransaction().begin();
	}

}
