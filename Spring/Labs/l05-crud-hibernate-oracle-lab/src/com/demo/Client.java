package com.demo;

import com.demo.entity.Customer;
import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

public class Client {
	public static void main(String[] args) {
		System.out.println("start of program");
		CustomerService service = new CustomerServiceImpl();

		Customer customer = null;

		customer = new Customer();
		
		 customer.setCustomerId(100); 
		 customer.setName("Rupesh");
		 
		  service.addCustomer(customer);
		 
		System.out.println("End of program...");
	}
}
