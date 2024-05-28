package com.example.hospital.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Data
public class Address {

	private String streetName;
	private int streetNumber;
	private String city;
}
