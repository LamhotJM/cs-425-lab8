package edu.miu.cs.cs425.demos.student.service.impl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs.cs425.demos.student.model.Student;
import edu.miu.cs.cs425.demos.student.repository.IStudentRepository;
import edu.miu.cs.cs425.demos.student.service.StudentService;


@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	IStudentRepository studentRepository;
	
	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}


}
