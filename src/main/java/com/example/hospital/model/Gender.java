package com.example.hospital.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Data
public class Gender {

	private String genderName;
	private boolean isBinary;
}
