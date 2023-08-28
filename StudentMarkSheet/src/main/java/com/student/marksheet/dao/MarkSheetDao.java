package com.student.marksheet.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.student.marksheet.entity.MarkSheet;
import com.student.marksheet.repository.MarkSheetRepository;

@Repository
public class MarkSheetDao {
	@Autowired
	MarkSheetRepository marrepo;

	public String insertmarkdetails(MarkSheet m) {
		marrepo.save(m);
		return "mark details saved";
	}

	public MarkSheet getMarks(int id) {
		return marrepo.findById(id).get();
	}

	public List<MarkSheet> getalllist() {
		return marrepo.findAll();
	}

	public String updatemark(MarkSheet m) {
		marrepo.save(m);
		return "mark details updated suceessfully";
	}

	public String delete(int id) {
		marrepo.deleteById(id);
		return "mark detail deleted successfuly";
	}

	public int getTotalsem1(int id) {
		return marrepo.getTotalsem1(id);
	}

	public int getTotalsem2(int id) {
		return marrepo.getTotalsem2(id);
	}
}
