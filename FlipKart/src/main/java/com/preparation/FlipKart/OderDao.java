package com.preparation.FlipKart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OderDao {
	@Autowired
	OrderRepository ordrepo;

	public String insertObject(OrderEntity o) {
		ordrepo.save(o);
		return "single object saved";
	}
	public List<String> get(){
		return ordrepo.get()	;
	}
}
