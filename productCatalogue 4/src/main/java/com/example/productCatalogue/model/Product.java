package com.example.productCatalogue.model;
import javax.persistence.*;


import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="Product")
public class Product {
@Id
@GeneratedValue(strategy= GenerationType.AUTO, generator="native")
@GenericGenerator(name="native", strategy="native")
@Column(name="SKU")
 private long SKU;


public long getSKU() {
	return SKU;
}

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="category_id") //foreign key.
private Category product_category;

@Column(name="size")
 private String size;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="color_id")
private Color color;


@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="brand_id")
private Brand brand;

@Column(name="quantity") 
private int quantity;


public Category getProduct_category() {
	return product_category;
}

public void setProduct_category(Category product_category) {
	this.product_category = product_category;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}

public Color getColor() {
	return color;
}

public void setColor(Color color) {
	this.color = color;
}
public Brand getBrand() {
	return brand;
}

public void setBrand(Brand brand) {
	this.brand = brand;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}




