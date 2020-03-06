package edu.miu.cs.cs425.demos.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.miu.cs.cs425.demos.student.model.Classroom;
import edu.miu.cs.cs425.demos.student.model.Transcript;

@Repository("transcriptRepository")
public interface ITranscriptRepository extends JpaRepository<Transcript,Long>{

}
