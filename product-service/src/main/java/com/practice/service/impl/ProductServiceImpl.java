package com.practice.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.practice.entity.Product;
import com.practice.repository.ProductRepository;
import com.practice.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product getProduct() {
		List<Product> products = productRepository.findAll();
		if (CollectionUtils.isEmpty(products)) {
			return new Product(1001, "default product", 4);
		}
		Collections.shuffle(products);
		return products.get(0);
	}
}
