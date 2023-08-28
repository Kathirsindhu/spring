package com.preparation.FlipKart;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
	@Query(value = "SELECT order_table.city,prod_table.name FROM flipkart_db.order_table "
			+ "join prod_table on order_table.order_id=prod_table.order_fk;", nativeQuery = true)
	public List<String> get();
}
