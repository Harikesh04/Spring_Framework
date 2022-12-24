package com.saswat.spring.springcoreadvanced.standalone;

import java.util.List;

public class ProductLists {
	private List<String> productNames;

	public List<String> getProductNames() {
		return productNames;
	}

	public void setProductNames(List<String> productNames) {
		this.productNames = productNames;
	}

	@Override
	public String toString() {
		return "ProductLists [productNames=" + productNames + "]";
	}
	
}
