package com.saswat.spring.springcore.propertyfile;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/saswat/spring/springcore/propertyfile/config.xml");
		MyDao mydao = (MyDao) context.getBean("mydao");
		System.out.println(mydao);
	}
}
