package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shop.domain.Product;
import com.shop.domain.enums.ProductType;
import com.shop.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping("/getProduct")
	public List<Product> getProductsByType(@RequestParam("type") String type) {
		return service.getProductsByType(ProductType.valueOf(type));
	}

}
