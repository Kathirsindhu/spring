package com.student.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.student.details.dao.StudentDao;
import com.student.details.entity.Student;

import StudentException.StudentException;

@Service
public class StudentService {
	@Autowired
	StudentDao studao;

	public String insert(Student s) throws StudentException, Exception {
		if (s.getAge() < 18) {
			throw new StudentException("age should be above 18");
		} else {
			return studao.insert(s);
		}
	}

	public Student getDetails(int id) {
		return studao.getDetails(id);
	}

	public String updateDetails(Student s) {
		return studao.updateDetails(s);
	}

	public String delete(@PathVariable int id) {
		return studao.delete(id);
	}
	public List<Student> getall() {
		return studao.getall();
	}
}
