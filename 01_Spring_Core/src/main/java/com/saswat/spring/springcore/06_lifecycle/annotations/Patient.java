package com.saswat.spring.springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("this is setter() function");
		this.id = id;
	}

	@PostConstruct
	public void hy() {
		System.out.println("this is init() method");
	}

	@PreDestroy
	public void bye() {
		System.out.println("this is destroy() method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
