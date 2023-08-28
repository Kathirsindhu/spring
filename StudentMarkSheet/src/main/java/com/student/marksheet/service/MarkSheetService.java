package com.student.marksheet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.marksheet.dao.MarkSheetDao;
import com.student.marksheet.entity.MarkSheet;

@Service
public class MarkSheetService {
	@Autowired
	MarkSheetDao mardao;

	public String insertmarkdetails(MarkSheet m) {
		m.setSem1Total(m.getSem1Theory() + m.getSem1Practicals());
		m.setSem2Total(m.getSem2Theory() + m.getSem2Practicals());
		return mardao.insertmarkdetails(m);
	}

	public MarkSheet getMarks(int id) {
		return mardao.getMarks(id);
	}

	public List<MarkSheet> getalllist() {
		return mardao.getalllist();
	}

	public String updatemark(MarkSheet m) {
		return mardao.updatemark(m);
	}

	public String delete(int id) {
		return mardao.delete(id);
	}

	public int getTotalsem1(int id) {

		return mardao.getTotalsem1(id);
	}

	public int getTotalsem2(int id) {
		return mardao.getTotalsem2(id);
	}

}
