package edu.miu.cs.cs425.demos.student.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name ="classrooms")
public class Classroom {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long classroomId;
	private String buildingName;
	private String roomNumber;
	

	 @OneToMany()
	 @JoinTable(name="classroom_stu")
		    private List<Student>  studentList;

	public Classroom(String buildingName, String roomNumber, List<Student> studentList) {
		super();
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
		this.studentList = studentList;
	}

	public Classroom(String buildingName, String roomNumber) {
		super();
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
	}

	public Long getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	@Override
	public String toString() {
		return String.format("Classroom [classroomId=%s, buildingName=%s, roomNumber=%s, studentList=%s]", classroomId,
				buildingName, roomNumber, studentList);
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public Classroom() {
		// TODO Auto-generated constructor stub
	}

}
