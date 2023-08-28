package com.product.useproduct;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UseProduct {
	RestTemplate rest = new RestTemplate();

//	GstController gd = new GstController();
//	GstService g = new GstService();
//
//	@GetMapping(value = "/priceandpercentageconvert")
//	public List<Product> getFullDetails() {
//		String url = "http://localhost:8080/product/getproductdetailslist";
//		ResponseEntity<List<Product>> kk = r.exchange(url, HttpMethod.GET, null,
//				new ParameterizedTypeReference<List<Product>>() {
//				});
//		List<Product> ka = kk.getBody();
////		ka.stream().forEach(x -> {
////			int a = g.getPriceByHsn(x.getHsn())
////					+ (g.getPriceByHsn(x.getHsn()) * g.getPercentageByHsn(x.getHsn()) / 100);
////			x.setPrice(a);
////		});
//		return ka;
//
//	}
	@GetMapping("priceandpercentageconvert2")
	public List<Product> getwithtax() {
		String url1 = "http://localhost:8080/product/getproductdetailslist";
		String url2 = "http://localhost:8081/gst/getpercentagebyhsn/";
		ResponseEntity<List<Product>> response1 = rest.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Product>>() {

				});
		List<Product> li = response1.getBody();
		for (Product p : li) {
			ResponseEntity<Integer> response2 = rest.exchange(url2 + p.getHsn(), HttpMethod.GET, null, Integer.class);
			int per = response2.getBody();
			p.setPrice(p.getPrice() + p.getPrice() * per / 100);
		}
		return li;
	}

}
