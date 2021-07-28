package com.practice.service.impl;

import org.springframework.stereotype.Service;

import com.practice.entity.Product;
import com.practice.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	/*@Autowired
	private ProductRepository productRepository;*/

	@Override
	public Product getProduct() {
		/*List<Product> products = productRepository.findAll();
		if (CollectionUtils.isEmpty(products)) {
			
		}
		Collections.shuffle(products);
		return products.get(0);*/
		return new Product(1001, "default product", 4);
	}
}
