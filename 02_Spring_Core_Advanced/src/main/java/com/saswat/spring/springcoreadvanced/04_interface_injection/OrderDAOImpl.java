package com.saswat.spring.springcoreadvanced.interface_injection;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("inside createOrder() of OrderDao");
	}

}
