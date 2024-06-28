package com.demon;

import java.util.Iterator;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demon.entity.Student;
import com.demon.repository.StudentRepository;

@SpringBootTest
class Demo21ApplicationTests {
	@Autowired
	private StudentRepository studentRepository;

	@Test
	void Studentcontext() {
		Student s=new Student();
		s.setName("zarina");
		s.setCity("telengana");
		s.setFee(20000);
		studentRepository.save(s);
		
	}
	@Test
	void deleteStudent() {
				studentRepository.deleteById(3L);
				studentRepository.deleteById(4L);
		
	}
	
	void getStudent() {
		Iterable<Student> all = studentRepository.findAll();
		for (Student student : all) {
			System.out.println(student.getName());
			System.out.println(student.getCity());
			System.out.println(student.getFee());
			System.out.println(student.getId());
			
		}
	}
	
	@Test
	void updateStudent() {
		
		Optional<Student> byId = studentRepository.findById((long) 20);
		if(byId.isPresent()) {
			
		}
		else {
			System.out.println("Not found");
		}
	}
}