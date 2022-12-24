package com.saswat.spring.springcoreadvanced.interface_injection;

public class OrderBOImpl implements OrderBO {

	private OrderDAO dao;

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public void placeOrder() {
		System.out.println("inside placeOrder() of OrderBO");
		dao.createOrder();
	}

}
