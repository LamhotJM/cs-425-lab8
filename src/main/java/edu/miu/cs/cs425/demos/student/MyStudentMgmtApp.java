package edu.miu.cs.cs425.demos.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.miu.cs.cs425.demos.student.model.Classroom;
import edu.miu.cs.cs425.demos.student.model.Student;
import edu.miu.cs.cs425.demos.student.model.Transcript;
import edu.miu.cs.cs425.demos.student.service.ClassroomService;
import edu.miu.cs.cs425.demos.student.service.StudentService;
import edu.miu.cs.cs425.demos.student.service.TranscriptService;


@SpringBootApplication
public class MyStudentMgmtApp implements CommandLineRunner{
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private TranscriptService transcriptService;
	
	@Autowired
	private ClassroomService classroomService;
	
	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Student> studentList = new ArrayList<Student>();
		// TODO Auto-generated method stub
		Student s1 = new Student("000-61-0001", "Anna","Kim", "Lyn",(float) 3.5,LocalDate.of(1992, 3,3));
		Student s2 = new Student("000-61-0002", "Anna","Kim", "Lyn",(float) 3.5,LocalDate.of(1992, 3,3));
		Student sService1 = studentService.save(s1);
		Student sService2 = studentService.save(s2);
		
		Transcript t1 = new Transcript("BS Computer Science", s1);
		Transcript t2 = new Transcript("BS Computer Science II", s2);
		transcriptService.save(t1);
		transcriptService.save(t2);
		
		studentList.add(s1);
		studentList.add(s2);
		
		Classroom cr1 = new Classroom("McLaughlin building", "M105",studentList);
		classroomService.save(cr1);
		
		
	}

}
