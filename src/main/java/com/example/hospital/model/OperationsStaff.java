package com.example.hospital.model;

import java.util.HashSet;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public abstract class OperationsStaff extends Staff {

	@ManyToMany
    @JoinTable(
        name = "operations_staff_patient",
        joinColumns = @JoinColumn(name = "operations_staff_id"),
        inverseJoinColumns = @JoinColumn(name = "patient_id")
    )
    private HashSet<Patient> patients;

}
