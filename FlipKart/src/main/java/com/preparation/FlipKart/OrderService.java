package com.preparation.FlipKart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class OrderService {
	@Autowired
	OderDao orddao;
	public String insertObject(OrderEntity o) {
		return orddao.insertObject(o);
	}
	public List<String> get(){
		return orddao.get()	;
	}
}
