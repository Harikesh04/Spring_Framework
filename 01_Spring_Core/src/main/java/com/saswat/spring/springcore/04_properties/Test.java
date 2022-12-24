package com.saswat.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/saswat/spring/springcore/properties/propertiesConfig.xml");
		CountriesAndLanguage countriesAndLanguage = (CountriesAndLanguage) context.getBean("countryAndLanguage");
		System.out.println(countriesAndLanguage);
	}
}
