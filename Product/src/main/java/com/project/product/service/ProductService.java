package com.project.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.product.dao.ProductDao;
import com.project.product.entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao productDao;

	public String insertProductData(Product p) {
		return productDao.insertProductData(p);
	}

	public String insertProductDataList(List<Product> p) {
		return productDao.insertProductDataList(p);
	}

	public Product getProductDetails(int id) {
		return productDao.getProductDetails(id);
	}

	public List<Product> getProductDetailslist() {
		return productDao.getProductDetailslist();
	}

	public String updateProductDetails(Product p) {
		return productDao.updateProductDetails(p);
	}
	public String deleteProduct(int id) {
		return productDao.deleteProduct(id);
	}

}
