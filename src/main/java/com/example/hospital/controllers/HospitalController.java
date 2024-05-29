package com.example.hospital.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hospital.exception.ResourceNotFoundException;
import com.example.hospital.model.Hospital;
import com.example.hospital.repository.HospitalRepository;
@RequestMapping("/hospitals")
@RestController
public class HospitalController {

	@Autowired 
	private HospitalRepository hopitalRepository;
	
	@GetMapping("/")
	private List<Hospital>getHospitales(){
		return hopitalRepository.findAll();
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<Hospital> getHospital(@PathVariable("id") String name) {
		Optional<Hospital> hospital = hopitalRepository.findById(name);
		if (hospital.isEmpty()) {
			throw new ResourceNotFoundException("Hospital not found with name " + name);
		}
		return new ResponseEntity(hospital.get(), HttpStatus.OK);
	}
	
	@PostMapping("/")
	private Hospital addHospital(@RequestBody Hospital hospital) {
		return hopitalRepository.save(hospital);
	}
	
	@PutMapping("/{id}")
	private void modifyHospital(@RequestBody Hospital hospital) {
		hopitalRepository.save(hospital);
	}
	
	@DeleteMapping("/{id}")
	private void deleteHospital(@PathVariable("id") String name) {
		hopitalRepository.deleteById(name);
	}
}
