package com.student.details.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.details.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
