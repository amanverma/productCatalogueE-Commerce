package com.example.productCatalogue.model;

public class BrandGroup {

	private Integer brand_id;
	private Integer SKUCount;
	public BrandGroup(Integer brand_id, Integer sKUCount) {
		super();
		this.brand_id = brand_id;
		SKUCount = sKUCount;
	}
	public Integer getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Integer brand_id) {
		this.brand_id = brand_id;
	}
	public Integer getSKUCount() {
		return SKUCount;
	}
	public void setSKUCount(Integer sKUCount) {
		SKUCount = sKUCount;
	}
}
