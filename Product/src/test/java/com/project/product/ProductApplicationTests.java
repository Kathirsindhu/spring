package com.project.product;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.product.controller.ProductController;

@SpringBootTest
class ProductApplicationTests {
	@Autowired
	ProductController p;

	@Test
	void contextLoads() {
	}

	@Test
	public void testThis() {
		//p.getProductDetailslist();
		assertNotNull(p.getProductDetailslist());
	}
}
