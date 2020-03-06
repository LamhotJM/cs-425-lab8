package edu.miu.cs.cs425.demos.student.service.impl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs.cs425.demos.student.model.Classroom;
import edu.miu.cs.cs425.demos.student.repository.IClassroomRepository;
import edu.miu.cs.cs425.demos.student.service.ClassroomService;



@Service("classroomService")
public class ClassroomServiceImpl implements ClassroomService {

	@Autowired
	IClassroomRepository classroomRepository;
	
	@Override
	public List<Classroom> findAll() {
		return classroomRepository.findAll();
	}

	@Override
	public Classroom save(Classroom classroom) {
		return classroomRepository.save(classroom);
	}


}
