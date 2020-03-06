package edu.miu.cs.cs425.demos.student.service.impl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs.cs425.demos.student.model.Student;
import edu.miu.cs.cs425.demos.student.model.Transcript;
import edu.miu.cs.cs425.demos.student.repository.IStudentRepository;
import edu.miu.cs.cs425.demos.student.repository.ITranscriptRepository;
import edu.miu.cs.cs425.demos.student.service.StudentService;
import edu.miu.cs.cs425.demos.student.service.TranscriptService;


@Service("transcriptService")
public class TranscriptServiceImpl implements TranscriptService {

	@Autowired
	ITranscriptRepository transcriptRepository;
	
	@Override
	public List<Transcript> findAll() {
		return transcriptRepository.findAll();
	}

	@Override
	public Transcript save(Transcript trans) {
		return transcriptRepository.save(trans);
	}


}
