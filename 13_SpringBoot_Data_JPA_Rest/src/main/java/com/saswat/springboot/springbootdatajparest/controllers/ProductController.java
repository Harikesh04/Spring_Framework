package com.saswat.springboot.springbootdatajparest.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saswat.springboot.springbootdatajparest.entities.Product;
import com.saswat.springboot.springbootdatajparest.repos.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductRepository repository;

//	read
	@GetMapping
	public Iterable<Product> getProducts() {
		return repository.findAll();
	}

//	create
	@PostMapping
	public Product create(@RequestBody Product product) {
		return repository.save(product);
	}

//	update
	@PutMapping
	public Product update(@RequestBody Product product) {
		return repository.save(product);
	}

//	delete
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") Long id) {
		Optional<Product> optional = repository.findById(id);
		Product product = null;
		if (optional.isPresent()) {
			product = optional.get();
		}
		return product;
	}

	// read one record
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}

}
