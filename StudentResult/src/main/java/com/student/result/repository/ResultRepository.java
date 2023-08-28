package com.student.result.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student.result.entity.MarkSheet;
import com.student.result.entity.Results;

public interface ResultRepository extends JpaRepository<Results, Integer> {
	@Query(value = "select * from test_db.mark_sheet;", nativeQuery = true)
	public MarkSheet getTable();

}
