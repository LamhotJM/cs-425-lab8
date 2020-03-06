package edu.miu.cs.cs425.demos.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="transcripts")
public class Transcript {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long classroomId;
	private String buildingName;
	private String roomNumber;

	public Transcript() {
		// TODO Auto-generated constructor stub
	}

}
