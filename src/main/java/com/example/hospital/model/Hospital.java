package com.example.hospital.model;

import java.util.HashSet;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Hospital {
	@Id
	private String name;
	private Address address;
	private Phone phone;
	@OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL, orphanRemoval = true)
	private HashSet<Department> departments;
	
	@ManyToMany
    @JoinTable(
        name = "hospital_staff",
        joinColumns = @JoinColumn(name = "hospital_id"),
        inverseJoinColumns = @JoinColumn(name = "staff_id")
    )
    private HashSet<Staff> staff;
	
	@ManyToMany
    @JoinTable(
        name = "hospital_patient",
        joinColumns = @JoinColumn(name = "hospital_id"),
        inverseJoinColumns = @JoinColumn(name = "patient_id")
    )
    private HashSet<Patient> patient;
}
