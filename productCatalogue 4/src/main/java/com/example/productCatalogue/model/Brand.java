package com.example.productCatalogue.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="brand")
public class Brand {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native", strategy="native")
	@Column(name="id")
	private int brand_id;
	
	@Column(name="Brand")
	private String brand_name;
	
	private List<Product> products = new ArrayList<>();

	public int getBrand_id() {
		return brand_id;
	}


	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}


	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "brand")
	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
