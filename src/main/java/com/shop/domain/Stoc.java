package com.shop.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Stoc {

	@Id
	private long id;

	private Integer stoc;

	@OneToOne(mappedBy = "stoc")
	@JsonIgnore
	private Product product;
}
