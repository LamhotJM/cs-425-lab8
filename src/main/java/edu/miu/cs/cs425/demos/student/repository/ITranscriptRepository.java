package edu.miu.cs.cs425.demos.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.miu.cs.cs425.demos.student.model.Transcript;

@Repository("transcriptRepository")
public interface ITranscriptRepository extends CrudRepository<Transcript,Long>{

}
