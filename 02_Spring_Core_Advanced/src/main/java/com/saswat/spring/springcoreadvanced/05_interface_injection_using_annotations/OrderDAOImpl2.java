package com.saswat.spring.springcoreadvanced.interface_injection_using_annotations;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("insede createOrder() of OrderDAOImpl2");
	}

}
