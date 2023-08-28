package com.preparation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SampleDao {
	@Autowired
	SampleRepository sr;
	public String insert(Salaryentity s) {
		sr.save(s);
		return "success";
	}
}
