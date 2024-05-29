package com.example.hospital.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hospital.model.Patient;
@RequestMapping("hospitals/{name}/patients")
@RestController
public class PatientController{

	@Autowired
	private PatienRepository patientRepository;
	
	@GetMapping("/")
	public List<Patient> getPatients(@PathVariable("name")String name){
		return patientRepository.findByHospitalName(name);
	}
	
}
