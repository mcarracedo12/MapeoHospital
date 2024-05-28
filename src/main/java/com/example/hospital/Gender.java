package com.example.hospital;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Data
@Getter
@Setter
public class Gender {

	@Id
	private Long id;
	private String gender;
}
