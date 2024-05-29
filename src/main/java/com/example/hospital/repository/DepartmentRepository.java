package com.example.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospital.model.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	List<Department> findByHospitalName(String name);

}
