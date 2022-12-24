package com.saswat.spring.springcore.lifecycle.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("this is setter() function");
		this.id = id;
	}

	public void hy() { // init() method
		System.out.println("this is init() method");
	}

	public void bye() { // destroy() method
		System.out.println("this is destroy() method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
