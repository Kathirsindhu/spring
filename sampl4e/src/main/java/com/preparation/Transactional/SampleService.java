package com.preparation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
	@Autowired
	SampleDao sd;

	public String insert(Salaryentity s) throws ExceptionGlobal {
		if (s.getSalary() >= 35000) {
			throw new ExceptionGlobal("salary should under 35000");
		}
		return sd.insert(s);
	}
}
