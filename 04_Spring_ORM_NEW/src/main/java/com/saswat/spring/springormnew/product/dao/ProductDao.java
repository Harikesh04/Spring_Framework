package com.saswat.spring.springormnew.product.dao;

import java.util.List;

import com.saswat.spring.springormnew.product.entity.Product;

public interface ProductDao {
	int insert(Product product);
	void update(Product product);
	void delete(Product product);
	Product findOne(int id);
	List<Product> findAll();
}
