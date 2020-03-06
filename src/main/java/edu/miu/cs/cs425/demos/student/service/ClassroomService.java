package edu.miu.cs.cs425.demos.student.service;

import java.util.List;

import edu.miu.cs.cs425.demos.student.model.Classroom;

public interface ClassroomService {
	 List<Classroom> findAll();
	 Classroom save(Classroom classroom);
	
}
