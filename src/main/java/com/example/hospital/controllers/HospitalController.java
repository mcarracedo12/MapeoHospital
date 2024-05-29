package com.example.hospital.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	private List<Hospital>getHospitales(){
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	private Optional<Hospital> getHospital(@PathVariable("id") String name){
		return repo.findById(name);
	}
	
	@PostMapping("/")
	private Hospital addHospital(@RequestBody Hospital hospital) {
		return repo.save(hospital);
	}
	
	@PutMapping("/{id}")
	private void modifyHospital(@RequestBody Hospital hospital) {
		repo.save(hospital);
	}
	
	@DeleteMapping("/{id}")
	private void deleteHospital(@PathVariable("id") String name) {
		repo.deleteById(name);
	}
}
