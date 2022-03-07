package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.StudentService.Studservice;

@Controller
public class studentformcontroller {
	
	@Autowired
	Studservice service;

	@GetMapping("/")
	public String retrivestudent(Model model) {
		
		model.addAttribute("students",service.getStudents());
		return "index";
		//return ResponseEntity.ok().body(service.getStudents());
		
		
	}
	
	@GetMapping("/new_student")
	public String new_student(Model model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "new_student";
	}
	
	
	
	@PostMapping("/savestudent")
	public String createstudent(@ModelAttribute("student") Student student) {
		service.saveStudent(student);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deletestudent(@PathVariable (value="id") long id, Model model) {
		service.deleteStudent(id);
		return "redirect:/";
		
		
	}
	@GetMapping("/update/{id}")
	public String updatestudent(@PathVariable (value="id") long id, Model model)
	{
		Optional<Student> student=service.getStudentById(id);
		model.addAttribute("student",student);
		return "update_student";
	}
	
	

}
