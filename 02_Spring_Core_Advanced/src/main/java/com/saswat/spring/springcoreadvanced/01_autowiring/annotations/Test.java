package com.saswat.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/saswat/spring/springcoreadvanced/autowiring/annotations/config.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		System.out.println(employee);
	}
}
