package com.example.productCatalogue.model;

public class PriceGroup {

	private Integer price;
	private Integer SKUCount;

	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	public Integer getSKUCount() {
		return SKUCount;
	}


	public void setSKUCount(Integer sKUCount) {
		SKUCount = sKUCount;
	}
	
	public PriceGroup(Integer price, Integer sKUCount) {
		super();
		this.price = price;
		SKUCount = sKUCount;
	}


	public PriceGroup() {
	}

}
