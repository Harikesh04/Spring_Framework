package com.saswat.spring.springcoreadvanced.autowiring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/saswat/spring/springcoreadvanced/autowiring/xml/config.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		System.out.println(employee);
	}
}
