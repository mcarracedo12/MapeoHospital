package com.example.hospital.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hospital.exception.ResourceNotFoundException;
import com.example.hospital.model.Department;
import com.example.hospital.model.Hospital;
import com.example.hospital.repository.DepartmentRepository;
import com.example.hospital.repository.HospitalRepository;

@RequestMapping("/hospitals/{hospital_name}/departments")
@RestController
public class DepartmentController {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private HospitalRepository hospitalRepository;

	
	@GetMapping("/{department_id}")
	private ResponseEntity<Department> getDepartmentByHospital(@PathVariable("hospital_name")String hospitalName, @PathVariable("department_id") Long department_id){
		Optional<Hospital> hospitalOptional = hospitalRepository.findById(hospitalName);
        if (hospitalOptional.isEmpty()) {
            throw new ResourceNotFoundException("Hospital not found with name: " + hospitalName);
        }
        Optional<Department> departmentOptional = departmentRepository.findById(department_id);
        if (departmentOptional.isEmpty()) {
            throw new ResourceNotFoundException("Department not found with id: " + department_id);
        }
        Department department = departmentOptional.get();
        if (!department.getHospital().getName().equals(hospitalName)) {
            throw new ResourceNotFoundException("Department not found in hospital with name: " + hospitalName);
        }
        return ResponseEntity.ok(department);
        
	}
		
	@GetMapping("/")
	public ResponseEntity<List<Department>> getDepartmentById(@PathVariable("hospital_name") String hospitalName,
			@PathVariable("id") Long departmentId) {
		Optional<Hospital> hospitalOptional = hospitalRepository.findById(hospitalName);
        if (hospitalOptional.isEmpty()) {
            throw new ResourceNotFoundException("Hospital not found with name: " + hospitalName);
        }
		List<Department> departments = departmentRepository.findByHospitalName(hospitalName);

		if (departments.isEmpty()) {
			throw new ResourceNotFoundException("Hospital not found with name: " + hospitalName);
		}
		return ResponseEntity.ok(departments);
	}
	
}
