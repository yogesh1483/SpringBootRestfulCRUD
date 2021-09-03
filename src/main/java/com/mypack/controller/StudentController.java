package com.mypack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypack.model.Student;
import com.mypack.repository.StudentRepository;

@RestController
@RequestMapping("students")
public class StudentController {
	@Autowired
	StudentRepository studentRepository;
	
	//Retrieve all student data from database
	@GetMapping("all")
	public List<Student> getAllStudent(){
		List<Student> student = (List<Student>) studentRepository.findAll();
		return student;
	}
	
	//Insert new student into database
	@PostMapping("add")
	public Student addStudent(@RequestBody Student student){
		return studentRepository.save(student);
	}
	
	//Get particular student by id
	@GetMapping("student/{id}")
	public Optional<Student> getStudentId(@PathVariable int id){
		return studentRepository.findById(id);
	}
	
	//Update existing student
	@PutMapping("update/{id}")
	public Student updateStudent(@RequestBody Student student){
		return studentRepository.save(student);
	}
	
	//Delete particular student from database
	@DeleteMapping("delete/{id}")
	public void deleteStudent(@PathVariable int id){
		studentRepository.deleteById(id);
	}
}
