package com.example.productCatalogue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.productCatalogue.model.BrandGroup;
import com.example.productCatalogue.model.CategoryGroup;
import com.example.productCatalogue.model.ColorGroup;
import com.example.productCatalogue.model.PriceGroup;
import com.example.productCatalogue.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	@Query("SELECT p from PRODUCT WHERE p.brand=?1")
	List<Product> findByBrand(String brand);
	@Query("SELECT p from PRODUCT WHERE p.sku=?1")
	List<Product> findBySKU(int SKU);
	
	@Query("select count(sku), price from product group by price")
	List<PriceGroup> groupByPrice();
	
	@Query("select count(sku), price from product group by brand")
	List<BrandGroup> groupByBrand();
	
	@Query("select count(sku), price from product group by category")
	List<CategoryGroup> groupByCategory();
	
	@Query("select count(sku), price from product group by color")
	List<ColorGroup> groupByColor();
}
