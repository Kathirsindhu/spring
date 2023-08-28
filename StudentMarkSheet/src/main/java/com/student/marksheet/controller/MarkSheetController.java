package com.student.marksheet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.marksheet.entity.MarkSheet;
import com.student.marksheet.service.MarkSheetService;

@RestController
@RequestMapping("/marksheet")
public class MarkSheetController {
	@Autowired
	MarkSheetService marser;

	@PostMapping("/insertmark")
	public String insertmarkdetails(@RequestBody MarkSheet m) {
		return marser.insertmarkdetails(m);

	}

	@GetMapping("/getmarks/{id}")
	public MarkSheet getMarks(@PathVariable int id) {
		return marser.getMarks(id);
	}

	@GetMapping("/getalllist")
	public List<MarkSheet> getalllist() {
		return marser.getalllist();
	}

	@PutMapping("/update")
	public String updatemark(@RequestBody MarkSheet m) {
		return marser.updatemark(m);
	}

	@DeleteMapping("/deletemark/{id}")
	public String delete(@PathVariable int id) {
		return marser.delete(id);
	}

	@GetMapping("/gettotalsem1/{id}")
	public int getTotalsem1(@PathVariable int id) {
		return marser.getTotalsem1(id);
	}

	@GetMapping("/gettotalsem2/{id}")
	public int getTotalsem2(@PathVariable int id) {
		return marser.getTotalsem2(id);
	}
}
