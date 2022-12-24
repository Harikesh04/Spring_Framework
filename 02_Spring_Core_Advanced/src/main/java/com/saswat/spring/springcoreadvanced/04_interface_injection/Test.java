package com.saswat.spring.springcoreadvanced.interface_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/saswat/spring/springcoreadvanced/interface_injection/config.xml");
		OrderBO bo = (OrderBO) ctx.getBean("bo");
		bo.placeOrder();
	}
}
