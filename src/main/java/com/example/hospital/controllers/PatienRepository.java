package com.example.hospital.controllers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.hospital.model.Patient;
@Repository
public interface PatienRepository extends JpaRepository<Patient, String>{

	public List<Patient> findByHospitalName(String name);
	
}
