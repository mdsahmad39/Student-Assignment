package com.student.app.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Document(collection = "student")
public class Student {
	
	@Id
	private final String id;
	private final String firstName;
	private final String lastName;
	private final Long rollNumber;
	private final Address address;
	
	@Data
	@RequiredArgsConstructor
	public static class Address {
		private final String street;
		private final String city;
		private final String state;
		private final String country;
		private final Long zipcode;
	}
}
