package com.example.productCatalogue.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productCatalogue.model.BrandGroup;
import com.example.productCatalogue.model.CategoryGroup;
import com.example.productCatalogue.model.ColorGroup;
import com.example.productCatalogue.model.PriceGroup;
import com.example.productCatalogue.model.Product;
import com.example.productCatalogue.repository.ProductRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/")
public class ProductController implements ProductRepository{
		@Autowired
		ProductRepository productRepo;
		
		@RequestMapping("/hello")
		public String sayHi() {
			return "hello";
		}
		
		@GetMapping("/{brand}")
		public List<Product> getByBrand(String brand){
			List<Product> products = productRepo.findByBrand(brand);
			return products;
		}
		@GetMapping("/{SKU}")
		public List<Product> getBySKU(int SKU){
			List<Product> products = productRepo.findBySKU(SKU);
			return products;
		}
		@GetMapping("/category")
		public List<CategoryGroup> groupByCategory(){
			List<CategoryGroup> categoryGroup = productRepo.groupByCategory();
			return categoryGroup;
		}
		@GetMapping("/brand")
		public List<BrandGroup> groupByBrand(){
			List<BrandGroup> brandGroup = productRepo.groupByBrand();
			return brandGroup;
		}
		@GetMapping("/color")
		public List<ColorGroup> groupByColor(){
			List<ColorGroup> colorGroup = productRepo.groupByColor();
			return colorGroup;
		}
		@GetMapping("/price")
		public List<PriceGroup> groupByPrice(){
			List<PriceGroup> priceGroup = productRepo.groupByPrice();
			return priceGroup;
		}

		@Override
		public List<Product> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Product> findAll(Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Product> findAllById(Iterable<Long> ids) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Product> List<S> saveAll(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void flush() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public <S extends Product> S saveAndFlush(S entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deleteInBatch(Iterable<Product> entities) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAllInBatch() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Product getOne(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Product> List<S> findAll(Example<S> example) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Product> List<S> findAll(Example<S> example, Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Page<Product> findAll(Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Product> S save(S entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Optional<Product> findById(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean existsById(Long id) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(Product entity) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAll(Iterable<? extends Product> entities) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public <S extends Product> Optional<S> findOne(Example<S> example) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Product> Page<S> findAll(Example<S> example, Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Product> long count(Example<S> example) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public <S extends Product> boolean exists(Example<S> example) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public List<Product> findByBrand(String brand) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Product> findBySKU(int SKU) {
			// TODO Auto-generated method stub
			return null;
		}
}
