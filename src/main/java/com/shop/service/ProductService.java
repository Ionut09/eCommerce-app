package com.shop.service;

import java.util.List;

import com.shop.domain.Product;
import com.shop.domain.enums.ProductType;

public interface ProductService {
	List<Product> getProductsByType(ProductType type);
}
