package com.example.hospital;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Getter
@Setter
@Embeddable
public class Fullname {

	private String givenName;
	private String middleName;
	private String familyName;
}
