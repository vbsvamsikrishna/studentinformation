package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan({"com.example.demo.Controllers","com.example.demo.StudentService","com.example.demo.Entity","com.example.demo.Repository"})
@SpringBootApplication(scanBasePackages={"com.example.Controllers","com.example.Entity","com.example.Pojo","com.example.Repository","com.exmple.Service"})
public class StudentinformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentinformationApplication.class, args);
		
	}

}
