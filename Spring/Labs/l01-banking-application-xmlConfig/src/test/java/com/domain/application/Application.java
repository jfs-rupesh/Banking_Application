package com.domain.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.service.transferService;



public class Application {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("applicationContext.xml").getBean("transferService",transferService.class).getTransactions().forEach(t->System.out.println("Date Of Transaction\t"+t.getTransactionDate()+"\nTransaction-ID"+t.getTransactionId()));
		
	}
}
