package com.student.marksheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student.marksheet.entity.MarkSheet;

public interface MarkSheetRepository extends JpaRepository<MarkSheet, Integer> {
	@Query(value = "select sem1total from test_db.mark_sheet where roll_number like '%\" + id + \"%';", nativeQuery = true)
	public int getTotalsem1(int id);

	@Query(value = "select sem2total from test_db.mark_sheet where roll_number like '%\" + id + \"%';", nativeQuery = true)
	public int getTotalsem2(int id);

}
