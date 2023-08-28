package com.preparation.Transactional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	SenderRepository sr;
	@Autowired
	ReceiverRepository rr;

	@Transactional
	@PostMapping("/postthis")
	public String post(@RequestBody Transaction t) {
		sr.save(t.getSender());
		int a = 10 / 0;
		rr.save(t.getReceiver());
		return "now saved";
	}
}
