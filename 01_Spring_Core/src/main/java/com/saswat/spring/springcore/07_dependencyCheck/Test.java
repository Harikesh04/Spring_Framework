package com.saswat.spring.springcore.dependencyCheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/saswat/spring/springcore/dependencyCheck/config.xml");
		Prescription prescription = (Prescription) ctx.getBean("prescription");
		System.out.println(prescription);
	}
}
