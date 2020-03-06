package edu.miu.cs.cs425.demos.student.model;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long studentId;
	private  String studentNumber;
	private String firstName ;
	private String middleName;
	public Student(String studentNumber, String firstName, String lastName,
			LocalDate dateOfEnrollment) {
		super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfEnrollment = dateOfEnrollment;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Float getCgpa() {
		return cgpa;
	}

	public void setCgpa(Float cgpa) {
		this.cgpa = cgpa;
	}

	public LocalDate getDateOfEnrollment() {
		return dateOfEnrollment;
	}

	public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}

	private String lastName;
	private Float cgpa;
	private LocalDate dateOfEnrollment;

	public Student() {
		// TODO Auto-generated constructor stub
	}

}
