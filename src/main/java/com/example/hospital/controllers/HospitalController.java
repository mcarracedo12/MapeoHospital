package com.example.hospital.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.model.Hospital;
import com.example.hospital.repository.HospitalRepository;
@RequestMapping("/hospitales")
@RestController
public class HospitalController {

	@Autowired 
	private HospitalRepository repo;
	
	@GetMapping("/")
	private List<Hospital>getHospitales() {
		return repo.findAll();
	}
	
	
	
}
