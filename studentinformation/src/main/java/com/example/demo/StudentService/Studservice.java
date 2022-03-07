package com.example.demo.StudentService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class Studservice {
	@Autowired
	private StudentRepository repository;

	
	public Student saveStudent(Student student) {
		return repository.save(student);
	}
	public List<Student> getStudents() {
		return repository.findAll();
	}
	
	public String deleteStudent(long id) {
		repository.deleteById((long) id);
		return "student deleted and id is"+id;
		
	}
	
	public Optional<Student> getStudentById(long id) {
		Optional<Student> existingstudent=repository.findById(id);
		return existingstudent;
		
	}
	public Optional<Student> updateStudent(long id) {
		Optional<Student> existingstudent=repository.findById(id);
		return existingstudent;
		
		
	}

}
