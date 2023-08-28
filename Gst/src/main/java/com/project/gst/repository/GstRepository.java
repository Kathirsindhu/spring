package com.project.gst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.gst.entity.Gst;

public interface GstRepository extends JpaRepository<Gst, Integer> {
	@Query(value = "select price from test_db.product_details where hsn like %?%;", nativeQuery = true)
	public int getPriceByHsn(int hsn);

	@Query(value = "select percentage from test_db.gst_details where hsn like %?%;", nativeQuery = true)
	public int getPercentageByHsn(int hsn);

}
