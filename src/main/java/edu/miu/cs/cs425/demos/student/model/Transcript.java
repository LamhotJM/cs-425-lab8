package edu.miu.cs.cs425.demos.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="transcripts")
public class Transcript {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long transcriptId;
	private String degreeTitle;
	@OneToOne
	@JoinColumn(name="student_fk")
	private Student studentTranscript;

	public Transcript(Long transcriptId, String degreeTitle) {
		super();
		this.transcriptId = transcriptId;
		this.degreeTitle = degreeTitle;
	}

	@Override
	public String toString() {
		return String.format("Transcript [transcriptId=%s, degreeTitle=%s]", transcriptId, degreeTitle);
	}

	public Long getTranscriptId() {
		return transcriptId;
	}

	public void setTranscriptId(Long transcriptId) {
		this.transcriptId = transcriptId;
	}

	public String getDegreeTitle() {
		return degreeTitle;
	}

	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}

	public Transcript() {
		// TODO Auto-generated constructor stub
	}

	public Transcript(String degreeTitle, Student studentTranscript) {
		
		this.degreeTitle = degreeTitle;
		this.studentTranscript = studentTranscript;
	}

}
