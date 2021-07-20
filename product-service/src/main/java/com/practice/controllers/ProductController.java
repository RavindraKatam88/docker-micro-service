package com.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.Product;
import com.practice.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	private Environment env;

	@Autowired
	private ProductService productService;

	@GetMapping
	public String getProduct() {
		return "Sample product" + env.getProperty("local.server.port");
	}

	@GetMapping("product-details")
	public Product getProductDetails() {
		return productService.getProduct();
	}

}
