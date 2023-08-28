package com.project.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.product.entity.Product;
import com.project.product.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository productRepository;

	public String insertProductData(Product p) {
		productRepository.save(p);
		return "Product data saves successfully";
	}

	public String insertProductDataList(List<Product> p) {
		productRepository.saveAll(p);
		return "product list saved successfully";
	}

	public Product getProductDetails(int id) {
		return productRepository.findById(id).get();

	}

	public List<Product> getProductDetailslist() {
		return productRepository.findAll();
	}

	public String updateProductDetails(Product p) {
		productRepository.save(p);
		return "Product detail updated successfully";
	}
	public String deleteProduct(int id) {
		productRepository.deleteById(id);
		return "product detail deleted succesfully";
	}

}
