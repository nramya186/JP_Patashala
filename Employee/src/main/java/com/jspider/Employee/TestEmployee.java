package com.jspider.Employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
 ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/jspider/Employee/config.xml");
 
 Employeee emp =(Employeee) context.getBean("rmy");
 
 System.out.println(emp);
	}

}
