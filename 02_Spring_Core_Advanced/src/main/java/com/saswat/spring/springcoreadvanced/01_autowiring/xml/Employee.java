package com.saswat.spring.springcoreadvanced.autowiring.xml;

public class Employee {
	private Address address;

	//for byName and byType auto-wiring
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	//for constructor auto-wiring
	public Employee(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
