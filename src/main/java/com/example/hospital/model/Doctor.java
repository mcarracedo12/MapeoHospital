package com.example.hospital.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public abstract class Doctor extends OperationsStaff{

	private String[] specialty;
	private String[] location;
}
