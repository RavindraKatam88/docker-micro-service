package com.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.dto.Product;

@RestController
public class OrderController {
	
	//@Autowired
	//private ProductProxy proxy;
	
	@GetMapping("/product-details")
	public Product getProduct(){
		//return proxy.getProduct();
		Product product= new Product();
		product.setProductName("sample");
		return product;
	}
	
	@GetMapping("/")
	public String getPing(){
		return "ping";
	}

}
