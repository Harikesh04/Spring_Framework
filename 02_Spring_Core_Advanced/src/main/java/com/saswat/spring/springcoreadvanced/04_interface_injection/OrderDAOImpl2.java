package com.saswat.spring.springcoreadvanced.interface_injection;

public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("insede createOrder() of OrderDAOImpl2");
	}

}
