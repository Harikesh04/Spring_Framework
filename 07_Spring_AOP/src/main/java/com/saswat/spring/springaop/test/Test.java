package com.saswat.spring.springaop.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saswat.spring.springaop.ProductService;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/saswat/spring/springaop/test/config.xml");
		ProductService productService = (ProductService) context.getBean("productServiceImpl");
		System.out.println(productService.multiply(10, 20));
	}

}
