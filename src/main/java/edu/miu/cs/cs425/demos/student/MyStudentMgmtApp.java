package edu.miu.cs.cs425.demos.student;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.miu.cs.cs425.demos.student.model.Student;
import edu.miu.cs.cs425.demos.student.repository.IStudentRepository;

@SpringBootApplication
public class MyStudentMgmtApp implements CommandLineRunner{

	@Autowired
	private IStudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student student1 = new Student("000-61-0001", "Anna", "Lyn",LocalDate.of(1992, 3,3));
		Student studentRepo= studentRepository.save(student1);
		System.out.println(studentRepo);
		
		
	}

}
