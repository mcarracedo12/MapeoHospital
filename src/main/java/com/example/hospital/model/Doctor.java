package com.example.hospital.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public abstract class Doctor extends OperationsStaff{

	private String[] specialty;
	private String[] location;
}
