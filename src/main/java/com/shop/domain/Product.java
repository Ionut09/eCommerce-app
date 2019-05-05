package com.shop.domain;

import java.math.BigDecimal;

import javax.persistence.*;

import com.shop.domain.enums.ProductType;

import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	private Long id;

	@Column(name = "name")
	private String productName;

	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	private ProductType productType;

	private BigDecimal price;

	@Lob
	private byte[] image;

	@OneToOne
	@JoinColumn(name = "stoc_id")
	private Stoc stoc;
}
