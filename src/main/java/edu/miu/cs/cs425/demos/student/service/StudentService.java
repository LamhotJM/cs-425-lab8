package edu.miu.cs.cs425.demos.student.service;

import java.util.List;

import edu.miu.cs.cs425.demos.student.model.Student;

public interface StudentService {
	 List<Student> findAll();
	 Student save(Student student);
	
}
