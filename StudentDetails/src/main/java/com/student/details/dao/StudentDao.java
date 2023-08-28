package com.student.details.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.student.details.entity.Student;
import com.student.details.repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository sturepo;

	public String insert(Student s) {
		sturepo.save(s);
		return "student detail saved";
	}

	public Student getDetails(int id) {
		return sturepo.findById(id).get();
	}

	public String updateDetails(Student s) {
		sturepo.save(s);
		return "detail updated success";
	}

	public String delete(@PathVariable int id) {
		sturepo.deleteById(id);
		return "Detail deleted";
	}
	public List<Student> getall() {
		return sturepo.findAll();
	}
}
