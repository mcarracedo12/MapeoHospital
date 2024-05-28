package com.example.hospital.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Embeddable
public class Fullname {

	private String givenName;
	private String middleName;
	private String familyName;
}
