package com.cts.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Account;
import com.cts.model.Employee;

public class EmployeeController {
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		context = new ClassPathXmlApplicationContext("spring-config.xml");
		Object obj=context.getBean("emp");
		Employee e=(Employee)obj;
		System.out.println("Employee id:"+e.getEmployeeId());
		System.out.println("employee name:"+e.getEmployeeName());
		System.out.println("email id:"+e.getEmailId());
		System.out.println("contact no:"+e.getContactNo());
		List<Account> ac=e.getAccount();
		for(Account accc:ac)
		{
			System.out.println("account number:"+accc.getAccountNo());
			System.out.println("accountholdername:"+accc.getHoldername());
		}
	}
}