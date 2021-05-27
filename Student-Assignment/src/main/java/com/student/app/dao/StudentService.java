package com.student.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.app.dto.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public Student createProfile(Student student) {
		return studentRepository.save(student);
	}
	
	public Student findByRollNumber(long rollNumber) {
		return studentRepository.findByRollNumber(rollNumber);
	}

	public void deleteProfile(Student student) {
		studentRepository.delete(student);
	}
	
	public List<Student> allStudents(){
		return studentRepository.findAll();
	}

	public Student updateProfile(Student student) {
		return studentRepository.save(student);
	}

}
