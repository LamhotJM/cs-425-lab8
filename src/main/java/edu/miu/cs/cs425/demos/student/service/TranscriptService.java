package edu.miu.cs.cs425.demos.student.service;

import java.util.List;


import edu.miu.cs.cs425.demos.student.model.Transcript;

public interface TranscriptService {
	 List<Transcript> findAll();
	 Transcript save(Transcript transcript);
	
}
