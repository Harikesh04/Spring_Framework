package com.saswat.spring.boot.springdatajpa.data.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.saswat.spring.boot.springdatajpa.data.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findByName(String name);

	List<Product> findByNameAndPrice(String name, Double price);
}
