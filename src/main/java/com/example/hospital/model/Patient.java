package com.example.hospital.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
	
	@JsonIgnore
	@ManyToMany
    @JoinTable(
        name = "hospital_patient",
        joinColumns = @JoinColumn(name = "patient_id"),
        inverseJoinColumns = @JoinColumn(name = "hospital_name")
    )
    private List<Hospital> hospital;
    	
}
