package com.saswat.spring.springcore.scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/saswat/spring/springcore/scopes/config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		Employee emp2 = (Employee) ctx.getBean("emp");

		System.out.println(emp.hashCode()); // same o/p if scope="singleton"
		System.out.println(emp2.hashCode()); // different o/p if scope="prototype"
	}
}
