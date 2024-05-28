package com.example.hospital.model;

import java.util.Date;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Entity
public class Patient extends Person {
	
	private String id;
	private int age;
	private Date accepted;
	@Embedded
	private History sickness;
	
}
