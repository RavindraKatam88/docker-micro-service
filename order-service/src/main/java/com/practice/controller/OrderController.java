package com.practice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.dto.Product;
import com.practice.proxy.ProductProxy;

@RestController
@RequestMapping("order-controller")
public class OrderController {

	@Autowired
	private ProductProxy proxy;

	@GetMapping("/product-details")
	public Product getProduct() {
		return proxy.getProduct();
	}

	@GetMapping("/")
	public String getPing() {
		return "ping from order controller";
	}

	@GetMapping("/products")
	public List<Product> getProducts() {
		Product product = Product.builder().productId(1).productName("iPhone").quantity(10).build();
		Product product1 = Product.builder().productId(1).productName("iPhone").quantity(10).build();
		return Arrays.asList(product, product1);
	}

}
