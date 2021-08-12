package com.practice.controller;

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
	public Product getProduct(){
		return proxy.getProduct();
	}
	
	@GetMapping("/")
	public String getPing(){
		return "ping";
	}

}
