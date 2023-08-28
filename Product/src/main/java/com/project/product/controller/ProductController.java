package com.project.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.product.entity.Product;
import com.project.product.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	@Autowired
	ProductService productService;

	@PostMapping(value = "/insert")
	public String insertProductData(@RequestBody Product p) {
		return productService.insertProductData(p);
	}

	@PostMapping(value = "/insertlist")
	public String insertProductDataList(@RequestBody List<Product> p) {
		return productService.insertProductDataList(p);
	}

	@GetMapping(value = "/getproductdetails/{id}")
	public Product getProductDetails(@PathVariable int id) {
		return productService.getProductDetails(id);
	}

	@GetMapping(value = "/getproductdetailslist")
	public List<Product> getProductDetailslist() {
		return productService.getProductDetailslist();
	}

	@PutMapping(value = "/updateproductdetails")
	public String updateProductDetails(@RequestBody Product p) {
		return productService.updateProductDetails(p);
	}

	@DeleteMapping(value = "/deleteproduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		return productService.deleteProduct(id);
	}

}
