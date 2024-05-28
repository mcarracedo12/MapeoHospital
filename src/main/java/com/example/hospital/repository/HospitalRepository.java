package com.example.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hospital.model.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, String>{

}
