package com.student.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.student.app.dto.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
	Student findByRollNumber(long rollNumber);
}
