package com.student.app.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.app.dao.StudentService;
import com.student.app.dto.Student;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	
	@PostMapping("/addStudent")
	public String createStudentProfile(@RequestBody Student student) {
		return studentService.createProfile(student) != null ? "Success" : "Failes";
	}

	@GetMapping("/student/all")
	public List<Student> allStudents() {
		return studentService.allStudents();
	}
	
	@GetMapping("/student/{rollNumber}")
	public Student findStudentByRollNumber(@PathVariable("rollNumber") long rollNumber) {
		return studentService.findByRollNumber(rollNumber);
	}
	
	@PostMapping("/updateStudent")
	public String updateStudent(@RequestBody Student student) {
		return studentService.updateProfile(student) != null ? "Success" : "Failes";
	}
	
	@PostMapping("/deleteStudent")
	public void deleteStudent(@RequestBody Student student) {
		studentService.deleteProfile(student);
	}

}
