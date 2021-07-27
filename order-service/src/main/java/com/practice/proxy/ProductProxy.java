package com.practice.proxy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.dto.Product;

//@FeignClient(name="product-service")
public interface ProductProxy {
	
	@RequestMapping(method = RequestMethod.GET, value = "/product/product-details")
	public Product getProduct();
}
