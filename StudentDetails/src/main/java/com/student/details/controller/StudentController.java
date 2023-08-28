package com.student.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.details.entity.Student;
import com.student.details.service.StudentService;

import StudentException.StudentException;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
	@Autowired
	StudentService stuser;

	@PostMapping(value = "/insertdetails")
	public String insert(@RequestBody Student s) throws StudentException, Exception {
		return stuser.insert(s);
	}

	@GetMapping(value = "/getdetails/{id}")
	public Student getDetails(@PathVariable int id) {
		return stuser.getDetails(id);
	}

	@GetMapping(value = "/getallaslist")
	public List<Student> getall() {
		return stuser.getall();
	}
	@PutMapping(value = "/updateDetails/{s}")
	public String updateDetails(@RequestBody Student s) {
		return stuser.updateDetails(s);
	}

	@DeleteMapping(value = "/delete/{id}")
	public String delete(@PathVariable int id) {
		return stuser.delete(id);
	}

}
