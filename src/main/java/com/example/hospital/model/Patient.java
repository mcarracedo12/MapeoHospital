package com.example.hospital.model;

import java.util.Date;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public final class Patient extends Person {
	
	private int age;
	private Date accepted;
	@Embedded
	private History sickness;
    	
}
