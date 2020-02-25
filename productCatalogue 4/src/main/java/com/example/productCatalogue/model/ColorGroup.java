package com.example.productCatalogue.model;

public class ColorGroup {
	private Integer color_id;
	private Integer SKUCount;
	public ColorGroup(Integer color_id, Integer sKUCount) {
		super();
		this.color_id = color_id;
		SKUCount = sKUCount;
	}
	public Integer getColor_id() {
		return color_id;
	}
	public void setColor_id(Integer color_id) {
		this.color_id = color_id;
	}
	public Integer getSKUCount() {
		return SKUCount;
	}
	public void setSKUCount(Integer sKUCount) {
		SKUCount = sKUCount;
	}
	

}
