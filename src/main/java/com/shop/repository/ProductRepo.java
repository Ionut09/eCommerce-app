package com.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shop.domain.Product;
import com.shop.domain.enums.ProductType;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

	@Query("SELECT p FROM Product p WHERE p.productType = ?1")
	List<Product> getProductsByType(ProductType type);
}
