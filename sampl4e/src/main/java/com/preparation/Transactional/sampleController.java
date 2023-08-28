package com.preparation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {

	@Autowired
	SampleService ss;

	@PostMapping("/insert")
	public String insert(@RequestBody Salaryentity s) throws ExceptionGlobal {
		return ss.insert(s);
	}
}
