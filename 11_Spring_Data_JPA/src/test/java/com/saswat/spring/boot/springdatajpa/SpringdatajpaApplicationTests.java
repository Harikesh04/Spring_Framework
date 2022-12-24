package com.saswat.spring.boot.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.saswat.spring.boot.springdatajpa.data.entities.Product;
import com.saswat.spring.boot.springdatajpa.data.repos.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {
	@Autowired
	ApplicationContext context;

	@Test
	void saveProduct() {
		ProductRepository repository = context.getBean(ProductRepository.class);

//		insert a record
		Product product = new Product();
		product.setId(3l);
		product.setName("gaming laptop");
		product.setPrice(200d);
		product.setDescription("i am a pro gamer");
		repository.save(product);

//		fetch one record by id
//		Optional<Product> optional = repository.findById(1l);
//		if(optional.isPresent()){
//			Product newProduct = optional.get();
//			System.out.println(newProduct);
//		}else {
//			System.out.println("table is empty");
//		}

//		update and set new values of the object overiding the old values
//		product.setPrice(100d);
//		repository.save(product);

//		fetch all records
//		Iterable<Product> findAll = repository.findAll();
//		findAll.forEach(product->System.out.println(product));

//		delete by id
//		repository.deleteById(2L);
		
//		custom finder method
//		System.out.println(repository.findByName("mac book pro"));
		
//		System.out.println(repository.findByNameAndPrice("iphone", 60d));

	}

}
