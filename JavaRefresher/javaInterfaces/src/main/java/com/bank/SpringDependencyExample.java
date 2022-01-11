package com.bank;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependencyExample {

	public static void main(String[] args) {
		ApplicationContext appContext
			= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		 
		Accountacct ac=(Accountacct)appContext.getBean("account");
		ac.AccountDetails();
		 
		 
	}

}
