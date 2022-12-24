package com.saswat.spring.boot.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.saswat.spring.boot.springboot.dao.Dao;

@Component
public class Service {
	@Autowired
	Dao dao;

	Service(Dao dao) {
		System.out.println("service bean created");
		this.dao = dao;
	}

	public void save() {
		dao.create();
	}
}
