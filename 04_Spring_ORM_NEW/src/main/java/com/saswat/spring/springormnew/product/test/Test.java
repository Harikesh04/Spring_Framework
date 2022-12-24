package com.saswat.spring.springormnew.product.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saswat.spring.springormnew.product.dao.ProductDao;
import com.saswat.spring.springormnew.product.entity.Product;

public class Test {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				" com/saswat/spring/springormnew/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDaoImpl");

		Product product = new Product();
//		insert
//		product.setId(5);
//		product.setName("earphone");
//		product.setDesc("this is a boat earphone");
//		product.setPrice(120);
//		productDao.insert(product);

//		update
//		product.setPrice(80);
//		productDao.update(product);

//		delete
//		product.setId(5);
//		productDao.delete(product);

//		fetch single row
//		Product singleProduct = productDao.findOne(1);
//		System.out.println(singleProduct);

//		fetch all rows
		List<Product> allProducts = productDao.findAll();
//		System.out.println(allProducts);
		for(Product newProduct : allProducts) {
			System.out.println(newProduct.getId() + " "+ newProduct.getName()+" "+newProduct.getDesc()+" "+newProduct.getPrice());
		}

	}
}
