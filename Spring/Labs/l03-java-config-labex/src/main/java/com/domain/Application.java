package com.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.model.Account;
import com.domain.service.AccountService;
import com.domain.service.AccountServiceImpl;

public class Application {
	public static void main(String[] args) {
		System.out.println("hello");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		AccountService accountService = applicationContext.getBean("accountService",
				AccountService.class);
		List<Account> accounts = accountService.getAccounts();

		accounts.forEach(System.out::println);
	}

}
