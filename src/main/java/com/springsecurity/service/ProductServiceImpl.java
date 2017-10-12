package com.springsecurity.service;

import java.util.ArrayList;
import java.util.List;

import com.springsecurity.persistence.Product;

public class ProductServiceImpl implements ProductService {
	
	List<Product> products = new ArrayList<Product>();
	private int productId = 0;
	
	public ProductServiceImpl() {
		Product product = new Product();
		product.setId(++productId);
		product.setDescription("Drone");
		products.add(product);
	}

	@Override
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public int addProduct(Product product) {
		product.setId(++productId);
		products.add(product);
		return productId;
	}

	

}
