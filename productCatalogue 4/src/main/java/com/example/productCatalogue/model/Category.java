package com.example.productCatalogue.model;


import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
							
@Entity
@Table(name="category")
public class Category {
@Id
@GeneratedValue(strategy= GenerationType.AUTO, generator="native")
@GenericGenerator(name="native", strategy="native")
@Column(name="id")
private int category_id;



@Column(name="Category")
private String category;


public int getId() {
	return category_id;
}


public void setId(int id) {
	this.category_id = id;
}

public String getCategory() {
	return category;
}


public void setCategory(String category) {
	this.category = category;
}

}
