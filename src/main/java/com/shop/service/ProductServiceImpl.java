package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.domain.Product;
import com.shop.domain.enums.ProductType;
import com.shop.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo repo;

	@Override
	public List<Product> getProductsByType(ProductType type) {
		return repo.getProductsByType(type);
	}

}
