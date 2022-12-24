package com.saswat.spring.springcoreadvanced.standalone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/saswat/spring/springcoreadvanced/standalone/config.xml");
		ProductLists productLists = (ProductLists) ctx.getBean("products");
		System.out.println(productLists);
	}
}
