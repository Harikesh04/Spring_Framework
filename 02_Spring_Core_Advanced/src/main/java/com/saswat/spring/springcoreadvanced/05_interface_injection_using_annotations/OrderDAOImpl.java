package com.saswat.spring.springcoreadvanced.interface_injection_using_annotations;

import org.springframework.stereotype.Component;

@Component("dao1")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("inside createOrder() of OrderDao");
	}

}
