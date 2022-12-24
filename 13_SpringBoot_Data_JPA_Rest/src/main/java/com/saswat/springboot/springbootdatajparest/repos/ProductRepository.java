package com.saswat.springboot.springbootdatajparest.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.saswat.springboot.springbootdatajparest.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
