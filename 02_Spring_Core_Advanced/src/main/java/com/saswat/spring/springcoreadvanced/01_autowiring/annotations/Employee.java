package com.saswat.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired // field level
	private Address address;

//	@Qualifier("myScores"); //tries to find a bean named as myScores
//	private Score score;

//	@Autowired		//constructor level
//	public Employee(Address address) {
//		super();
//		this.address = address;
//	}

	public Address getAddress() {
		return address;
	}

//	@Autowired		//getter setter lavel
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
