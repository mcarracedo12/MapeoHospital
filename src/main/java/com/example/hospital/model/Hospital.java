package com.example.hospital.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Entity
public class Hospital {
	@Id
	private String name;
	private Address address;
	private Phone phone;
	@OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL, orphanRemoval = true)
	private Department[] departments;
	
}
