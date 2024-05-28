package com.example.hospital;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Paciente extends Person {
	public Paciente() {
		super();
	}
}
