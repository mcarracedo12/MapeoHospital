package com.example.hospital.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class History {

	private String[] prescriptions;
	private String[] allergies;
	private String[] specialReqs;
}
