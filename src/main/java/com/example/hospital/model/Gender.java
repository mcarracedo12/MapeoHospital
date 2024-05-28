package com.example.hospital.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Gender {

	private String genderName;
	private boolean isBinary;
}
