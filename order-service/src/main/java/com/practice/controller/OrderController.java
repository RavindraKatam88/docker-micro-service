package com.practice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.dto.Product;
import com.practice.proxy.ProductProxy;

@RestController
@RequestMapping("order-controller")
public class OrderController {
	private static Map<Integer, Product> dataMap = new HashMap<>();
	static {
		dataMap.put(1, Product.builder().productId(1).productName("iPhone").quantity(10).build());
		dataMap.put(2, Product.builder().productId(2).productName("one plus").quantity(5).build());
		dataMap.put(3, Product.builder().productId(3).productName("samsung").quantity(12).build());
		dataMap.put(3, Product.builder().productId(3).productName("oppo").quantity(12).build());
	}

	/*@Autowired
	private ProductProxy proxy;

	@GetMapping("/product-details")
	public Product getProduct() {
		return proxy.getProduct();
	}*/

	@GetMapping("/")
	public String getPing() {
		return "ping from order controller";
	}

	@GetMapping("/products")
	public List<Product> getProducts() {
		return new ArrayList<>(dataMap.values());
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable("id") Integer id) {
		return dataMap.get(id);
	}
	

}
