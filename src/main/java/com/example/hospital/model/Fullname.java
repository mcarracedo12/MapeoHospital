package com.example.hospital.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Fullname {

	private String givenName;
	private String middleName;
	private String familyName;
}
