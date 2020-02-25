package com.example.productCatalogue.model;


public class CategoryGroup {

	private Integer categoryId;
	private Integer SKUCount;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}


	public Integer getSKUCount() {
		return SKUCount;
	}

	public void setSKUCount(Integer sKUCount) {
		SKUCount = sKUCount;
	}

	public CategoryGroup(Integer categoryId, Integer SKUCount) {
		this.categoryId = categoryId;
		this.SKUCount = SKUCount;
	}

	public CategoryGroup() {
	}

}
