package com.cts.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Account;
import com.cts.model.Employee;

public class EmployeeController
{
	
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		context = new ClassPathXmlApplicationContext("spring-config.xml");
		Object obj=context.getBean("emp");
		Employee e=(Employee) obj;
		Account ac=e.getAccount();
		System.out.println("SystemNo:"+e.getSysNo());
		System.out.println("Room No:"+e.getRoomNo());
		System.out.println("id:"+e.getId());
		System.out.println("name:"+e.getName());
		System.out.println("salary:"+e.getSalary());
		System.out.println("gender:"+e.getGender());
		System.out.println("mobile No;"+e.getMobileNo());
		System.out.println("marital status:"+e.isMaritalStatus());
		System.out.println("account no:"+ac.getAccountNo());
		System.out.println("account name:"+ac.getHolderName());
		
		
	}

}
