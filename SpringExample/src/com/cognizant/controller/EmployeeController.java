package com.cognizant.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.Employee;

public class EmployeeController
{
	
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		context = new ClassPathXmlApplicationContext("spring-config.xml");
		Object obj=context.getBean("emp");
		Employee e=(Employee) obj;
		System.out.println("employeeid:"+e.getEmployeeId());
		System.out.println("employeename:"+e.getEmployeeName());
		System.out.println("employeesalary:"+e.getSalary());
		System.out.println("employeeemailid:"+e.getEmailId());
		System.out.println("employeecontactno:"+e.getContactno());
		
	}

}
