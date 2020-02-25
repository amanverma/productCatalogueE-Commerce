package com.example.productCatalogue.model;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Color")
public class Color {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native", strategy="native")
	@Column(name="id")
	private int color_id;
	
	@Column(name="Color")
	private String color;

	private List<Product> products = new ArrayList<>();

	public int getColor_id() {
		return color_id;
	}

	
	public void setColor_id(int color_id) {
		this.color_id = color_id;
	}

	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "color")
	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
