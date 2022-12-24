package com.saswat.spring.springcore.referenceType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/saswat/spring/springcore/referenceType/config.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}
}
