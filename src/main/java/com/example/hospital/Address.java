package com.example.hospital;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Data
@Getter
@Setter
public class Address {

	private String streetName;
	private int number;
	private String city;
}
