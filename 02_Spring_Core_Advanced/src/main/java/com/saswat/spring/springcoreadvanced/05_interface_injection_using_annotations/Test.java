package com.saswat.spring.springcoreadvanced.interface_injection_using_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/saswat/spring/springcoreadvanced/interface_injection_using_annotations/config.xml");
		OrderBO bo = (OrderBO) ctx.getBean("bo");
		bo.placeOrder();
	}
}
