package com.student.app.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.student.app.dao.StudentRepository;

@EnableMongoRepositories(basePackages = "com.student.app.dao")
@SpringBootApplication(scanBasePackages = "com.student.app")
public class StudentAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAssignmentApplication.class, args);
	}

}
